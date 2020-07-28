package com.example.demo.data.repository;

import com.example.demo.data.entity.Room;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@Repository
public interface RoomRepository extends CrudRepository<Room, Long> { }
