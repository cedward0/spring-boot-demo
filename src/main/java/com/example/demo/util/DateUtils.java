package com.example.demo.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class DateUtils
{
	//~ Static fields/initializers ---------------
	/**  */
	private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param   dateString
	 * @return
	 */
	public static Date createDateFromDateString(String dateString)
	{
		Date date = null;
		if (null != dateString)
		{
			try
			{
				date = DATE_FORMAT.parse(dateString);
			}
			catch (ParseException e)
			{
				date = new Date();
			}
		}
		else
		{
			date = new Date();
		}

		return date;
	}
}
