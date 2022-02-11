/*
 * 
 * Date			User	ProjectVersion	  FileVersion		Description
 * -----------------------------------------------------------------------
 * 15.04.2019	Sebi		3.0.6-0			1.0.0-0			Base Version
 * 13.11.2019	Sebi		3.0.6-4			1.0.0-1			Added possibility to define Log Directory Path
 * 
 */

package com.vmware.vim25.util.log.filehandler;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

/**
 * Class handling writing operations on logfiles
 * 
 * @author www.it-ps.at
 */
public class LogFileHandler {

	private String logDirString = "./logs";
	private File logDir;
	
	/**
	 * Constructor
	 */
	public LogFileHandler() {
		logDir = new File(logDirString);
		createLogDir();
		//clearLogs();
	};
	
	/**
	 * Appends a line of Type String to a file named after a Hostname (if not such file exists it will be created)
	 * @param line			Line of String to log
	 * @param hostname		Hostname
	 */
	public void writeLog(String line, String hostname) {
		if(this.logDir.exists()) {
			try {
			    final Path path = Paths.get(this.logDirString + "/"+hostname+".log");
			    Files.write(path, Arrays.asList(line), StandardCharsets.UTF_8, Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
			} catch (IOException ioe) {
				System.out.println("[ERROR] - There was an error while writing to the LogFiles.");
			}
		}else {
			createLogDir();
		}
	}
	
	/**
	 * Appends a line of Type String to a file named after a Hostname (if not such file exists it will be created)
	 * @param line			Line of String to log
	 * @param hostname		Hostname
	 */
	public void writeLog(String line, String hostname, String dir) {
		File file = new File(dir);
		if(!file.exists()) {
			createLogDir(dir);
		}
		try {
		    final Path path = Paths.get(dir + "/"+hostname+".log");
		    Files.write(path, Arrays.asList(line), StandardCharsets.UTF_8, Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
		} catch (IOException ioe) {
			System.out.println("[ERROR] - There was an error while writing to the LogFiles.");
		}
	}
	
	/**
	 * Creates a directory if not exists
	 */
	private void createLogDir() {
		if(!this.logDir.exists()) {
			this.logDir.mkdirs();
		}
	}
	
	/**
	 * Creates a directory if not exists
	 */
	private void createLogDir(String path) {
		File file = new File(path);
		if(!(file.exists())) {
			file.mkdirs();
		}
	}
	
}
