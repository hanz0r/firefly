package org.hannes.firefly.net;

import java.nio.ByteBuffer;

public interface Serializable {

	/**
	 * Serializes the byte buffer 
	 * 
	 * @return
	 */
	public abstract ByteBuffer serialize(Session session);

}