package com.example.demo.data.entity.pizza;

import java.math.BigDecimal;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public abstract class Pizza
{
	//~ Instance fields --------------------------
	/**  */
	protected String description;
	//~ Methods ----------------------------------

	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public String getDescription()
	{
		return description;
	}
	

	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public abstract BigDecimal getCost();
}
