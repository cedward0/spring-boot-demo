package com.example.demo.util;

import com.example.demo.aspect.LogginAspect;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class BeanPostProcessorImpl implements BeanPostProcessor
{
	//~ Methods ----------------------------------
	/**
	 * @see  org.springframework.beans.factory.config.BeanPostProcessor#postProcessBeforeInitialization(java.lang.Object,
	 *       java.lang.String)
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException
	{
		LogginAspect.LOGGER.info("before init - " + beanName);

		return bean;
	}
	
	/**
	 * @see  org.springframework.beans.factory.config.BeanPostProcessor#postProcessAfterInitialization(java.lang.Object, java.lang.String)
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
	{
		LogginAspect.LOGGER.info("after init - " + beanName);

		return bean;
	}
}
