package org.hannes.firefly.event.transform;

import org.hannes.firefly.event.Event;

/**
 * Transforms something into an event
 * 
 * @author Red
 *
 */
public interface Transformer {

	/**
	 * 
	 * @param context
	 * @return
	 */
	public abstract Event transform(TransformationContext context);

}