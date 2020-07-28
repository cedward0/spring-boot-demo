package com.example.demo.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@Entity
@Table(name = "GUEST")
public class Guest
{
	//~ Instance fields --------------------------
	/**  */
	@Column(name = "ADDRESS")
	private String address;

	/**  */
	@Column(name = "COUNTRY")
	private String country;

	/**  */
	@Column(name = "EMAIL_ADDRESS")
	private String emailAddress;

	/**  */
	@Column(name = "FIRST_NAME")
	private String firstName;

	/**  */
	@Column(name = "GUEST_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long guestId;

	/**  */
	@Column(name = "LAST_NAME")
	private String lastName;

	/**  */
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;

	/**  */
	@Column(name = "STATE")
	private String state;
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public long getGuestId()
	{
		return guestId;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  guestId
	 */
	public void setGuestId(long guestId)
	{
		this.guestId = guestId;
	}
	
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
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public String getAddress()
	{
		return address;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  address
	 */
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public String getCountry()
	{
		return country;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  country
	 */
	public void setCountry(String country)
	{
		this.country = country;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public String getState()
	{
		return state;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  state
	 */
	public void setState(String state)
	{
		this.state = state;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
}
