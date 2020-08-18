package com.example.demo.data.entity.pizza;

import java.math.BigDecimal;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class ThickCrustPizza extends Pizza
{
	//~ Constructors -----------------------------
	/** Creates a new ThickCrustPizza object. */
	public ThickCrustPizza( )
	{
		super( );
		this.description = "Thick Crust Pizza";
	}
	//~ Methods ----------------------------------
	/** @see  com.example.demo.data.entity.pizza.Pizza#getCost() */
	@Override
	public BigDecimal getCost()
	{
		return new BigDecimal(15);
	}
}
