package com.example.demo;

import com.example.demo.proto.PrototypeSpring;
import com.example.demo.proto.SingletonSpring;
import com.example.demo.repository.PresidentRepository;
import com.example.demo.sing.SingletonJava;

import org.junit.Assert;
import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DesignPatternsApplicationTests
{
	//~ Instance fields --------------------------
	/**  */
	@Autowired
	SingletonSpring false1;

	/**  */
	@Autowired
	SingletonSpring false2;

	/**  */
	@Autowired
	PresidentRepository presidentRepository;

	/**  */
	@Autowired
	com.example.demo.sing.SingletonSpring singletonSpring1;

	/**  */
	@Autowired
	com.example.demo.sing.SingletonSpring singletonSpring2;

	/**  */
	@Autowired
	PrototypeSpring true1;

	/**  */
	@Autowired
	PrototypeSpring true2;
	//~ Methods ----------------------------------
	/** DOCUMENT ME! */
	@Test
	public void testSingletons()
	{
		SingletonJava singletonJava1 = SingletonJava.getInstance();
		SingletonJava singletonJava2 = SingletonJava.getInstance();
		Assert.assertNotNull(singletonJava1);
		Assert.assertSame(singletonJava1, singletonJava2);
		Assert.assertNotNull(singletonSpring1);
		Assert.assertSame(singletonSpring1, singletonSpring2);
	}
	
	/** DOCUMENT ME! */
	@Test
	public void testPrototypes()
	{
		Assert.assertSame(false1, false2);
		Assert.assertNotSame(true1, true2);
	}
	
	/** DOCUMENT ME! */
	@Test
	public void testRepository()
	{
		System.out.println(presidentRepository.findById(1L));
		System.out.println(presidentRepository.findById(2L));
	}
}
