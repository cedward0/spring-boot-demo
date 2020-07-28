package com.example.demo.controller;

import com.example.demo.contact.Contact;
import com.example.demo.contact.ContactBuilder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@RequestMapping("/contact")
@RestController
public class ContactController
{
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	@GetMapping("presidents")
	public List<Contact> getPresidents()
	{
		List<Contact> contacts = new ArrayList<>();

		Contact contact = new Contact();
		contact.setFirstName("George");
		contact.setFirstName("Wash");
		contacts.add(contact);

		contacts.add(new Contact("John", "Adams", null));

		contacts.add(new ContactBuilder().setFirstName("Thomas").setLastName("Jefferson").setEmailAddress("email")
			.buildContract());

		return contacts;
	}
}
