package com.example.demo.controller;

import com.example.demo.aspect.Countable;
import com.example.demo.business.domain.RoomReservation;
import com.example.demo.business.service.ReservationService;
import com.example.demo.business.util.DateUtils;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@Controller
@RequestMapping("/reservations")
public class RoomReservationWebController
{
	//~ Instance fields --------------------------
	/**  */
	private final ReservationService reservationService;
	//~ Constructors -----------------------------
	/**
	 * Creates a new RoomReservationWebController object.
	 *
	 * @param  reservationService
	 */
	@Autowired
	public RoomReservationWebController(ReservationService reservationService)
	{
		this.reservationService = reservationService;
	}
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param   dateString
	 * @param   model
	 * @return
	 */
	@Countable
	@GetMapping
	public String getReservations(@RequestParam(
			value = "date",
			required = false
		) String dateString, Model model)
	{
		Date date = DateUtils.createDateFromDateString(dateString);
		List<RoomReservation> roomReservations = this.reservationService.getRoomReservationsForDate(date);
		model.addAttribute("roomReservations", roomReservations);

		return "reservations";
	}
}
