package com.example.demo.data.entity.fruit;

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class MoroOrange implements Orange
{
	//~ Methods ----------------------------------
	/** @see  com.example.demo.data.entity.fruit.Orange#getVariety() */
	@Override
	public String getVariety()
	{
		return "Moro Blood Orange";
	}
	

	/** @see  com.example.demo.data.entity.fruit.Orange#eat() */
	@Override
	public void eat()
	{
		System.out.println("Moro gets enjoied");
	}
	

	/** @see  com.example.demo.data.entity.fruit.Orange#peel() */
	@Override
	public void peel()
	{
		System.out.println("Moro gets peeled");
	}
	

	/** @see  com.example.demo.data.entity.fruit.Orange#juice() */
	@Override
	public void juice()
	{
		System.out.println("Moro gets juiced");
	}
}
