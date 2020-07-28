package com.example.demo.data.entity;

import java.sql.Date;

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
@Table(name = "RESERVATION")
public class Reservation
{
	//~ Instance fields --------------------------
	/**  */
	@Column(name = "GUEST_ID")
	private long guestId;

	/**  */
	@Column(name = "RES_DATE")
	private Date reservationDate;

	/**  */
	@Column(name = "RESERVATION_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long reservationId;

	/**  */
	@Column(name = "ROOM_ID")
	private long roomId;
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public long getReservationId()
	{
		return reservationId;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  reservationId
	 */
	public void setReservationId(long reservationId)
	{
		this.reservationId = reservationId;
	}
	
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
	public Date getReservationDate()
	{
		return reservationDate;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  reservationDate
	 */
	public void setReservationDate(Date reservationDate)
	{
		this.reservationDate = reservationDate;
	}
}
