package org.hannes.firefly.rs;

import org.hannes.firefly.net.Channel;
import org.hannes.firefly.net.Session;
import org.hannes.firefly.util.Attributes;
import org.hannes.firefly.util.Holder;

public class RSSession implements Session {

	/**
	 * The attributes for the session
	 */
	private final Attributes attributes = new Attributes();
	
	/**
	 * The holder for the state
	 */
	private final Holder<State> state = new Holder<>(State.DISCOVERED);

	/**
	 * The channel for this session
	 */
	private Channel channel;

	@Override
	public void register(Channel channel) {
		if (this.channel == null) {
			this.channel = channel;
		} else
			throw new IllegalStateException("channel already bound");
	}

	@Override
	public void close() {
		// TODO
	}

	@Override
	public Channel channel() {
		return channel;
	}

	@Override
	public Attributes attributes() {
		return attributes;
	}

	@Override
	public Holder<State> state() {
		return state;
	}

}