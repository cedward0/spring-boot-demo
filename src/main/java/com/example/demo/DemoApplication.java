package com.example.demo;

import com.example.demo.business.proto.PrototypeSpring;
import com.example.demo.business.proto.SingletonSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;

import org.springframework.web.client.RestTemplate;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@EnableAspectJAutoProxy
@SpringBootApplication
public class DemoApplication
{
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param  args
	 */
	public static void main(String[] args)
	{
		SpringApplication.run(DemoApplication.class, args);
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	@Bean
	public SingletonSpring protoFalse()
	{
		return new SingletonSpring();
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	@Bean
	@Scope("prototype")
	public PrototypeSpring protoTrue()
	{
		return new PrototypeSpring();
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
}
