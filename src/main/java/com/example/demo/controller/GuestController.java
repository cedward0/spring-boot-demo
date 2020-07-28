package com.example.demo.controller;

import com.example.demo.aspect.Countable;
import com.example.demo.data.entity.Guest;
import com.example.demo.data.repository.GuestRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@RequestMapping("/guest")
@RestController
public class GuestController
{
	//~ Instance fields --------------------------
	/**  */
	@Autowired
	private GuestRepository guestRepository;
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	@Countable
	@GetMapping
	public Iterable<Guest> getGuests()
	{
		return guestRepository.findAll();
	}
}
