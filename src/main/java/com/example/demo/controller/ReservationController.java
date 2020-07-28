package com.example.demo.controller;

import com.example.demo.data.entity.Reservation;
import com.example.demo.data.repository.ReservationRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@RequestMapping("/reservation")
@RestController
public class ReservationController
{
	//~ Instance fields --------------------------
	/**  */
	@Autowired
	private ReservationRepository reservationRepository;
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	@GetMapping
	public Iterable<Reservation> getReservations()
	{
		return reservationRepository.findAll();
	}
}
