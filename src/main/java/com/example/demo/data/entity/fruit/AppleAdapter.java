package com.example.demo.data.entity.fruit;

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class AppleAdapter implements Apple
{
	//~ Instance fields --------------------------
	/**  */
	private final Orange orange;
	//~ Constructors -----------------------------
	/**
	 * Creates a new AppleAdapter object.
	 *
	 * @param  orange
	 */
	public AppleAdapter(Orange orange)
	{
		this.orange = orange;
	}
	//~ Methods ----------------------------------
	/** @see  com.example.demo.data.entity.fruit.Apple#getVariety() */
	@Override
	public String getVariety()
	{
		return orange.getVariety();
	}
	
	/** @see  com.example.demo.data.entity.fruit.Apple#peel() */
	@Override
	public void eat()
	{
		orange.peel();
		orange.eat();
	}
}
