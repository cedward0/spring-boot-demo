package com.example.demo.data.entity.pet;

import org.springframework.stereotype.Component;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@Component
public class PetFactory
{
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param   animalType
	 * @return
	 */
	public Pet createPet(String animalType)
	{
		switch (animalType.toLowerCase())
		{
			case "dog":
			{
				return new Dog();
			}

			case "cat":
			{
				return new Cat();
			}

			default:
			{
				throw new UnsupportedOperationException("unknown animal type");
			}
		}
	}
}
