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
@Table(name = "ROOM")
public class Room
{
	//~ Instance fields --------------------------
	/**  */
	@Column(name = "BED_INFO")
	private String bedInfo;

	/**  */
	@Column(name = "ROOM_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long roomId;

	/**  */
	@Column(name = "NAME")
	private String roomName;

	/**  */
	@Column(name = "ROOM_NUMBER")
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
	public String getBedInfo()
	{
		return bedInfo;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  bedInfo
	 */
	public void setBedInfo(String bedInfo)
	{
		this.bedInfo = bedInfo;
	}
}
