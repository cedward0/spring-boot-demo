package com.example.demo.business.service;

import com.example.demo.business.domain.RoomReservation;
import com.example.demo.data.entity.Guest;
import com.example.demo.data.entity.Reservation;
import com.example.demo.data.entity.Room;
import com.example.demo.data.repository.GuestRepository;
import com.example.demo.data.repository.ReservationRepository;
import com.example.demo.data.repository.RoomRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@Service
public class ReservationService
{
	//~ Instance fields --------------------------
	/**  */
	private final GuestRepository guestRepository;

	/**  */
	private final ReservationRepository reservationRepository;

	/**  */
	private final RoomRepository roomRepository;
	//~ Constructors -----------------------------
	/**
	 * Creates a new ReservationService object.
	 *
	 * @param  roomRepository
	 * @param  guestRepository
	 * @param  reservationRepository
	 */
	@Autowired
	public ReservationService(RoomRepository roomRepository, GuestRepository guestRepository,
		ReservationRepository reservationRepository)
	{
		this.roomRepository = roomRepository;
		this.guestRepository = guestRepository;
		this.reservationRepository = reservationRepository;
	}
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param   date
	 * @return
	 */
	public List<RoomReservation> getRoomReservationsForDate(Date date)
	{
		Iterable<Room> rooms = this.roomRepository.findAll();
		Map<Long, RoomReservation> roomReservationMap = new HashMap();
		rooms.forEach(room ->
		{
			RoomReservation roomReservation = new RoomReservation();
			roomReservation.setRoomId(room.getRoomId());
			roomReservation.setRoomName(room.getRoomName());
			roomReservation.setRoomNumber(room.getRoomNumber());
			roomReservationMap.put(room.getRoomId(), roomReservation);
		});
		Iterable<Reservation> reservations = this.reservationRepository.findReservationByReservationDate(
				new java.sql.Date(date.getTime()));
		reservations.forEach(reservation ->
		{
			RoomReservation roomReservation = roomReservationMap.get(reservation.getRoomId());
			roomReservation.setDate(date);
			Guest guest = this.guestRepository.findById(reservation.getGuestId()).get();
			roomReservation.setFirstName(guest.getFirstName());
			roomReservation.setLastName(guest.getLastName());
			roomReservation.setGuestId(guest.getGuestId());
		});
		List<RoomReservation> roomReservations = new ArrayList<>();
		for (Long id : roomReservationMap.keySet())
		{
			roomReservations.add(roomReservationMap.get(id));
		}

		roomReservations.sort((RoomReservation o1, RoomReservation o2) ->
		{
			if (o1.getRoomName() == o2.getRoomName())
			{
				return o1.getRoomNumber().compareTo(o2.getRoomNumber());
			}

			return o1.getRoomName().compareTo(o2.getRoomName());
		});

		return roomReservations;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public Iterable<Guest> getHotelGuests()
	{
		return guestRepository.findAll();
	}
}
