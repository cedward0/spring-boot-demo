package com.example.demo.pet;

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class Cat implements Pet
{
	//~ Instance fields --------------------------
	/**  */
	String name;

	/**  */
	String type = "Cat";
	//~ Methods ----------------------------------
	/** @see  com.example.demo.pet.Pet#feed() */
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
	
	/** @see  com.example.demo.pet.Pet#setName(java.lang.String) */
	@Override
	public void setName(String name)
	{
		this.name = name;
	}
}
