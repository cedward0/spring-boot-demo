package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Component;

import java.util.Arrays;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@Aspect
@Component
public class LogginAspect
{
	//~ Static fields/initializers ---------------
	/**  */
	public static final Logger LOGGER = LoggerFactory.getLogger(LogginAspect.class);
	//~ Methods ----------------------------------
	/**  */
	@Pointcut("@annotation(Loggable)")
	public void executeLogging() { }
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  joinPoint
	 */
	@Before("executeLogging()")
	public void logMethodCall(JoinPoint joinPoint)
	{
		StringBuilder message = new StringBuilder("Method: ");
		message.append(joinPoint.getSignature().getName());
		Object[] args = joinPoint.getArgs();
		if ((null != args) && (args.length > 0))
		{
			message.append(" args=[ | ");
			Arrays.asList(args).forEach(arg ->{ message.append(arg).append(" | "); });
			message.append("]");
		}
		LOGGER.info(message.toString());
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  joinPoint
	 */
	@Around("executeLogging()")
	public Object logMethodCall(ProceedingJoinPoint joinPoint) throws Throwable
	{
		long startTime = System.currentTimeMillis();
		Object returnValue = joinPoint.proceed();
		long totalTime = System.currentTimeMillis() - startTime;
		StringBuilder message = new StringBuilder("Method: ");
		message.append(joinPoint.getSignature().getName());
		message.append(" totalTime: ").append(totalTime).append("ms ");
		Object[] args = joinPoint.getArgs();
		if ((null != args) && (args.length > 0))
		{
			message.append(" args=[ | ");
			Arrays.asList(args).forEach(arg ->{ message.append(arg).append(" | "); });
			message.append("]");
		}
		message.append(", returning: ").append(returnValue.toString());
		LOGGER.info(message.toString());

		return returnValue;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  joinPoint
	 */
	@AfterReturning(
		value = "executeLogging()",
		returning = "returnValue"
	)
	public void logMethodCallAfter(JoinPoint joinPoint, Object returnValue)
	{
		StringBuilder message = new StringBuilder("Method: ");
		message.append(joinPoint.getSignature().getName());
		Object[] args = joinPoint.getArgs();
		if ((null != args) && (args.length > 0))
		{
			message.append(" args=[ | ");
			Arrays.asList(args).forEach(arg ->{ message.append(arg).append(" | "); });
			message.append("]");
		}
		message.append(", returning: ").append(returnValue.toString());
		LOGGER.info(message.toString());
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  joinPoint
	 */
	@AfterThrowing(
		value = "executeLogging()",
		throwing = "throwing"
	)
	public void logMethodCallAfterThrowing(JoinPoint joinPoint, Throwable throwing)
	{
		StringBuilder message = new StringBuilder("Method: ");
		message.append(joinPoint.getSignature().getName());
		Object[] args = joinPoint.getArgs();
		if ((null != args) && (args.length > 0))
		{
			message.append(" args=[ | ");
			Arrays.asList(args).forEach(arg ->{ message.append(arg).append(" | "); });
			message.append("]");
		}
		message.append(", throwing: ").append(throwing.toString());
		LOGGER.info(message.toString());
	}
}
