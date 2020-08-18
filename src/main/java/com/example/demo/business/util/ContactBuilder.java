package com.example.demo.business.util;

import com.example.demo.data.entity.Contact;

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class ContactBuilder
{
	//~ Instance fields --------------------------
	/**  */
	String emailAddress;

	/**  */
	String firstName;

	/**  */
	String lastName;
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param   emailAddress
	 * @return
	 */
	public ContactBuilder setEmailAddress(String emailAddress)
	{
		this.emailAddress = emailAddress;

		return this;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param   firstName
	 * @return
	 */
	public ContactBuilder setFirstName(String firstName)
	{
		this.firstName = firstName;

		return this;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param   lastName
	 * @return
	 */
	public ContactBuilder setLastName(String lastName)
	{
		this.lastName = lastName;

		return this;
	}
	

	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public Contact buildContract()
	{
		return new Contact(firstName, lastName, emailAddress);
	}
}
