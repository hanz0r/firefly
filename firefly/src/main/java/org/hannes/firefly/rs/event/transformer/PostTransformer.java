package org.hannes.firefly.rs.event.transformer;

import org.hannes.firefly.event.Event;
import org.hannes.firefly.event.transform.TransformState;
import org.hannes.firefly.event.transform.TransformationContext;
import org.hannes.firefly.event.transform.Transformer;
import org.hannes.firefly.net.Session.State;

@TransformState(State.ACTIVE)
public class PostTransformer implements Transformer {

	@Override
	public Event transform(TransformationContext context) {
		return new Event("HIIII");
	}

}