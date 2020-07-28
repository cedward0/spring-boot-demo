package com.example.demo.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */

@Entity
@Table(name = "PRESIDENT")
public class PresidentEntity
{
	//~ Instance fields --------------------------
	/**  */
	@Column(name = "EMAIL_ADDRESS")
	private String emailAddress;

	/**  */
	@Column(name = "FIRST_NAME")
	private String firstName;

	/**  */
	@Column(name = "PRESIDENT_ID")
	@GeneratedValue
	@Id
	private long id;

	/**  */
	@Column(name = "LAST_NAME")
	private String lastName;

	/**  */
	@Column(name = "MIDDLE_INITIAL")
	private String middleInitial;
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public long getId()
	{
		return id;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  id
	 */
	public void setId(long id)
	{
		this.id = id;
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
	public String getMiddleInitial()
	{
		return middleInitial;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  middleInitial
	 */
	public void setMiddleInitial(String middleInitial)
	{
		this.middleInitial = middleInitial;
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
	
	/** @see  java.lang.Object#toString() */
	@Override
	public String toString()
	{
		final StringBuilder sb = new StringBuilder("PresidentEntity{");
		sb.append("id=").append(id);
		sb.append(", firstName='").append(firstName).append('\'');
		sb.append(", middleInitial='").append(middleInitial).append('\'');
		sb.append(", lastName='").append(lastName).append('\'');
		sb.append(", emailAddress='").append(emailAddress).append('\'');
		sb.append('}');

		return sb.toString();
	}
}
