package org.hannes.firefly.event.handler;

import java.io.IOException;

import org.hannes.firefly.event.handler.context.EventHandlerContext;

/**
 * 
 * 
 * @author Red
 */
@FunctionalInterface
public interface EventHandler {

	/**
	 * 
	 * 
	 * @param in
	 * @param out
	 * @throws IOException
	 */
	public abstract void onReceive(EventHandlerContext ctx) throws IOException;

}