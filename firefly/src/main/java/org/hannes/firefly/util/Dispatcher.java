package org.hannes.firefly.util;

import org.hannes.firefly.net.Session;

/**
 * 
 * 
 * @author Red
 *
 * @param <T>
 */
@FunctionalInterface
public interface Dispatcher<T> {

	/**
	 * 
	 * @param object
	 */
	public abstract void dispatch(T object, Session session);

}