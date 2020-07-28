package com.example.demo.pizza;

import java.math.BigDecimal;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class Pepperoni extends PizzaIngredient
{
	//~ Instance fields --------------------------
	/**  */
	public Pizza pizza;
	//~ Constructors -----------------------------
	/**
	 * Creates a new Pepperoni object.
	 *
	 * @param  pizza
	 */
	public Pepperoni(Pizza pizza)
	{
		this.pizza = pizza;
	}
	//~ Methods ----------------------------------
	/** @see  com.example.demo.pizza.PizzaIngredient#getDescription() */
	@Override
	public String getDescription()
	{
		return this.pizza.getDescription() + " + pepperoni";
	}
	
	/** @see  com.example.demo.pizza.Pizza#getCost() */
	@Override
	public BigDecimal getCost()
	{
		return new BigDecimal(1.5).add(this.pizza.getCost());
	}
}
