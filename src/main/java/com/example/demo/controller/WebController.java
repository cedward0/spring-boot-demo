package com.example.demo.controller;

import com.example.demo.aspect.Countable;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@Controller
@RequestMapping(value = "/")
public class WebController
{
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	@Countable
	public String index()
	{
		return "index";
	}
}
