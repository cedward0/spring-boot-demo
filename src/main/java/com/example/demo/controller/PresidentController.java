package com.example.demo.controller;

import com.example.demo.contact.Contact;
import com.example.demo.contact.ContactBuilder;
import com.example.demo.repository.PresidentEntity;
import com.example.demo.repository.PresidentRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@RequestMapping("/president")
@RestController
public class PresidentController
{
	//~ Instance fields --------------------------
	/**  */
	@Autowired
	PresidentRepository presidentRepository;

	/**  */
	@Autowired
	RestTemplate restTemplate;
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param   id
	 * @return
	 */
	@GetMapping("{id}")
	public PresidentEntity getPresById(@PathVariable
		Long id)
	{
		return presidentRepository.findById(id).get();
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param   id
	 * @return
	 */
	@GetMapping("contact/{id}")
	public Contact getPresContById(@PathVariable
		Long id)
	{
		PresidentEntity entity = this.restTemplate.getForEntity("http://localhost:9090/president/{id}",
				PresidentEntity.class, id).getBody();

		return new ContactBuilder().setFirstName(entity.getFirstName()).setLastName(entity.getLastName())
			.setEmailAddress(entity.getEmailAddress()).buildContract();
	}
}
