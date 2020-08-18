package com.example.demo.controller;

import com.example.demo.aspect.Countable;
import com.example.demo.business.domain.RoomReservation;
import com.example.demo.business.service.ReservationService;
import com.example.demo.business.util.DateUtils;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@RequestMapping("api/reservations")
@RestController
public class RoomReservationWebServiceController
{
	//~ Instance fields --------------------------
	/**  */
	private final ReservationService reservationService;
	//~ Constructors -----------------------------
	/**
	 * Creates a new RoomReservationWebServiceController object.
	 *
	 * @param  reservationService
	 */
	@Autowired
	public RoomReservationWebServiceController(ReservationService reservationService)
	{
		this.reservationService = reservationService;
	}
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param   dateString
	 * @return
	 */
	@Countable
	@GetMapping
	public List<RoomReservation> getRoomReservations(@RequestParam(
			name = "date",
			required = false
		) String dateString)
	{
		Date date = DateUtils.createDateFromDateString(dateString);

		return this.reservationService.getRoomReservationsForDate(date);
	}
}
