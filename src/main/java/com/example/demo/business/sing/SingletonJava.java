package com.example.demo.business.sing;

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class SingletonJava
{
	//~ Static fields/initializers ---------------
	/**  */
	private static volatile SingletonJava instance;
	//~ Constructors -----------------------------
	/** Creates a new SingA object. */
	private SingletonJava( )
	{
		super( );
	}
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public static SingletonJava getInstance()
	{
		if (null == instance)
		{
			synchronized (SingletonJava.class)
			{
				if (null == instance)
				{
					instance = new SingletonJava();
				}
			}
		}

		return instance;
	}
}
