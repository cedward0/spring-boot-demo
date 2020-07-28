package com.example.demo.contact;

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class Contact
{
	//~ Instance fields --------------------------
	/**  */
	String emailAddress;

	/**  */
	String firstName;

	/**  */
	String lastName;
	//~ Constructors -----------------------------
	/** Creates a new Contact object. */
	public Contact( ) { }

	/**
	 * Creates a new Contact object.
	 *
	 * @param  firstName
	 * @param  lastName
	 * @param  emailAddress
	 */
	public Contact(String firstName, String lastName, String emailAddress)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
	}
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public String getFirstName()
	{
		return firstName;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  firstName
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public String getLastName()
	{
		return lastName;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  lastName
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public String getEmailAddress()
	{
		return emailAddress;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  emailAddress
	 */
	public void setEmailAddress(String emailAddress)
	{
		this.emailAddress = emailAddress;
	}
}
