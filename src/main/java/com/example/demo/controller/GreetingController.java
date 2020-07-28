package com.example.demo.controller;

/**
 * DOCUMENT ME!
 *
 * @version $Revision$, $Date$
 */

import com.example.demo.aspect.Countable;
import com.example.demo.business.service.GreetingService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@Controller
@RequestMapping("/greeting")
public class GreetingController
{
	//~ Instance fields --------------------------
	/**  */
	private final GreetingService greetingService;
	//~ Constructors -----------------------------
	/**
	 * Creates a new GreetingController object.
	 *
	 * @param  greetingService
	 */
	@Autowired
	public GreetingController(GreetingService greetingService)
	{
		this.greetingService = greetingService;
	}
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param   name
	 * @param   model
	 * @return
	 */
	@Countable
	@GetMapping
	public String greeting(@RequestParam(
			name = "name",
			required = false,
			defaultValue = "World"
		) String name, Model model)
	{
		Map<String, String> greetingDetails = greetingService.getGreetingDetails();

		model.addAttribute("greeting", greetingDetails.get("greeting"));
		model.addAttribute("name", name + " " + greetingDetails.get("appName"));
		model.addAttribute("is24", greetingDetails.get("is24"));

		return "greeting";
	}
}
