package com.example.demo.data.repository;

import com.example.demo.data.entity.Reservation;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import java.sql.Date;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long>
{
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param   date
	 * @return
	 */
	Iterable<Reservation> findReservationByReservationDate(Date date);
}
