package com.example.demo.business.service;

import com.example.demo.aspect.Loggable;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@Service
public class GreetingService
{
	//~ Instance fields --------------------------
	/**  */
	@Value("${app.name}")
	private String appName;

	/**  */
	@Value("${app.greeting}")
	private String greeting;

	/**  */
	@Value("#{new Boolean(environment['spring.profiles.active']!='dev')}")
	private String is24;
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	@Loggable
	public Map<String, String> getGreetingDetails()
	{
		Map<String, String> greetingDetails = new HashMap<>();
		greetingDetails.put("greeting", greeting);
		greetingDetails.put("name", appName);
		greetingDetails.put("is24", is24);

		return greetingDetails;
	}
}
