package com.example.demo.controller;

import com.example.demo.pet.Pet;
import com.example.demo.pet.PetFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@RequestMapping("/pet")
@RestController
public class PetController extends PresidentController
{
	//~ Instance fields --------------------------
	/**  */
	@Autowired
	private PetFactory petFactory;
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param   type
	 * @param   name
	 * @return
	 */
	@PostMapping("adoptPet/{type}/{name}")
	public Pet adoptPet(@PathVariable
		String type, @PathVariable
		String name)
	{
		Pet pet = this.petFactory.createPet(type);
		pet.setName(name);
		pet.feed();

		return pet;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	@GetMapping
	public String getDefault()
	{
		return "{\"messge\":\"pet\"}";
	}
}