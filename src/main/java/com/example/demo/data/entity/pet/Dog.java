package com.example.demo.data.entity.pet;

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class Dog implements Pet
{
	//~ Instance fields --------------------------
	/**  */
	String name;

	/**  */
	String type = "Dog";
	//~ Methods ----------------------------------
	/** @see  com.example.demo.data.entity.pet.Pet#feed() */
	@Override
	public void feed() { }
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public String getType()
	{
		return type;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public String getName()
	{
		return name;
	}
	
	/** @see  com.example.demo.data.entity.pet.Pet#setName(java.lang.String) */
	@Override
	public void setName(String name)
	{
		this.name = name;
	}
}
