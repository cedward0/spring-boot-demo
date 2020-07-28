package com.example.demo.controller;

import com.example.demo.business.service.ReservationService;
import com.example.demo.data.entity.Guest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@Controller
@RequestMapping("/guests")
public class GuestWebController
{
	//~ Instance fields --------------------------
	/**  */
	private final ReservationService reservationService;
	//~ Constructors -----------------------------
	/**
	 * Creates a new GuestWebController object.
	 *
	 * @param  reservationService
	 */
	@Autowired
	public GuestWebController(ReservationService reservationService)
	{
		this.reservationService = reservationService;
	}
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param   model
	 * @return
	 */
	@GetMapping
	public String getGuests(Model model)
	{
		Iterable<Guest> guests = this.reservationService.getHotelGuests();
		model.addAttribute("guests", guests);

		return "guests";
	}
}
