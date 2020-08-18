package com.example.demo.data.entity.pizza;

import org.junit.Test;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class PizzaTest
{
	//~ Methods ----------------------------------
	/** DOCUMENT ME! */
	@Test
	public void testDecorator()
	{
		Pizza pizza = new ThickCrustPizza();
		System.out.println(pizza.getDescription());
		System.out.println(pizza.getCost());

		Pepperoni pepperoni = new Pepperoni(pizza);
		System.out.println(pepperoni.getDescription());
		System.out.println(pepperoni.getCost());

		Pepperoni doublePepperoni = new Pepperoni(pepperoni);
		System.out.println(doublePepperoni.getDescription());
		System.out.println(doublePepperoni.getCost());
	}
}
