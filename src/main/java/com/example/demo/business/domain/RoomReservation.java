package com.example.demo.business.domain;

import java.util.Date;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class RoomReservation
{
	//~ Instance fields --------------------------
	/**  */
	private Date date;

	/**  */
	private String firstName;

	/**  */
	private long guestId;

	/**  */
	private String lastName;

	/**  */
	private long roomId;

	/**  */
	private String roomName;

	/**  */
	private String roomNumber;
	//~ Methods ----------------------------------

	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public long getRoomId()
	{
		return roomId;
	}
	

	/**
	 * DOCUMENT ME!
	 *
	 * @param  roomId
	 */
	public void setRoomId(long roomId)
	{
		this.roomId = roomId;
	}
	

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
	public String getRoomName()
	{
		return roomName;
	}
	

	/**
	 * DOCUMENT ME!
	 *
	 * @param  roomName
	 */
	public void setRoomName(String roomName)
	{
		this.roomName = roomName;
	}
	

	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public String getRoomNumber()
	{
		return roomNumber;
	}
	

	/**
	 * DOCUMENT ME!
	 *
	 * @param  roomNumber
	 */
	public void setRoomNumber(String roomNumber)
	{
		this.roomNumber = roomNumber;
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
	public Date getDate()
	{
		return date;
	}
	

	/**
	 * DOCUMENT ME!
	 *
	 * @param  date
	 */
	public void setDate(Date date)
	{
		this.date = date;
	}
}
