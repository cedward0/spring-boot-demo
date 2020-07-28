package com.example.demo.controller;

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@Controller
@RequestMapping("/greeting")
public class GreetingController
{
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param   name
	 * @param   model
	 * @return
	 */
	@GetMapping
	public String greeting(@RequestParam(
			name = "name",
			required = false,
			defaultValue = "World"
		) String name, Model model)
	{
		model.addAttribute("name", name);

		return "greeting";
	}
}
