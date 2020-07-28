package com.example.demo.controller;

import com.example.demo.aspect.Countable;
import com.example.demo.data.entity.Room;
import com.example.demo.data.repository.RoomRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@RequestMapping("/room")
@RestController
public class RoomController
{
	//~ Instance fields --------------------------
	/**  */
	@Autowired
	private RoomRepository roomRepository;
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	@Countable
	@GetMapping
	public Iterable<Room> getRooms()
	{
		return roomRepository.findAll();
	}
}
