/*
 * 
 * Date			User	ProjectVersion	  FileVersion		Description
 * -----------------------------------------------------------------------
 * 15.04.2019	Sebi		3.0.6-0			1.0.0-0			Base Version
 * 25.03.2020	Sebi		3.0.6-1			1.0.0-1			Rewrote Error Stream
 * 
 */

package com.vmware.vim25.util.log.stream;

import com.vmware.vim25.util.log.Logger;

import java.io.OutputStream;


/**
 * Class extending OutputStream handling Error logging from Stream sources
 * 
 * @author www.it-ps.at
 */
public class LogErrStream extends OutputStream {

	private String host;
	StringBuilder sb;
	
	private boolean ERROR_FLAG;
	
	public boolean getErrorFlag() {
		return this.ERROR_FLAG;
	}

	/**
	 * Constructor
	 * 
	 * @param host Host
	 */
	public LogErrStream(String host) {
		this.host = host;
		this.ERROR_FLAG = false;
		sb = new StringBuilder();
	}

	@Override
	public void write(int b) {
		int[] bytes = { b };
		write(bytes, 0, bytes.length);
	}

	/**
	 * Writes Error to StringBuilder
	 * @param bytes			Bytes
	 * @param offset		Offset
	 * @param length		Length
	 */
	public void write(int[] bytes, int offset, int length) {
		String s = new String(bytes, offset, length);
		this.sb.append(s);
		if (this.sb.toString().endsWith("\n")) {
			flushStream();
		}
	}

	/**
	 * Flushes the StringBuilder and writes it to the Logger
	 */
	public void flushStream() {
		if (sb != null && !sb.toString().isEmpty()) {
			this.ERROR_FLAG = true;
			String s = this.sb.toString();
			Logger.info(this.host, s);
		}
		this.sb = new StringBuilder();
	}

}
