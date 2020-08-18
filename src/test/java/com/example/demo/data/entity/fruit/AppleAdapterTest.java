package com.example.demo.data.entity.fruit;

import org.junit.Test;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class AppleAdapterTest
{
	//~ Methods ----------------------------------
	/** DOCUMENT ME! */
	@Test
	public void testAdapter()
	{
		Orange orange = new MoroOrange();
		Apple apple = new AppleAdapter(orange);
		System.out.println(apple.getVariety());
		apple.eat();
	}
}
