package com.example.demo.data.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@Repository
public interface PresidentRepository extends CrudRepository<PresidentEntity, Long>
{
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param   emailAddress
	 * @return
	 */
	PresidentEntity findByEmailAddress(String emailAddress);
}
