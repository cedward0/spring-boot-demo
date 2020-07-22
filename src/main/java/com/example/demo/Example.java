package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@EnableAutoConfiguration
@RestController
public class Example
{
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	@RequestMapping("/")
	String home()
	{
		return "Hello World!";
	}
}
