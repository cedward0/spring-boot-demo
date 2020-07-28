package com.example.demo.controller;

import com.example.demo.aspect.Countable;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@EnableAutoConfiguration
@RequestMapping("/hello")
@RestController
public class RootController
{
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	@Countable
	@GetMapping
	public String home()
	{
		return "Hello World!";
	}
}
