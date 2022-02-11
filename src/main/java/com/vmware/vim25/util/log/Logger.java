/*
 * 
 * Date			User	ProjectVersion	  FileVersion		Description
 * -----------------------------------------------------------------------
 * 15.04.2019	Sebi		3.0.6-0			1.0.0-0			Base Version
 * 13.11.2019	Sebi		3.0.6-1			1.0.0-1			Added additional Log functionality
 * 20.11.2019	Sebi		3.0.6-2			1.0.0-2			Added additional logging functionality
 * 
 */

package com.vmware.vim25.util.log;

import com.vmware.vim25.util.log.filehandler.LogFileHandler;
import java.text.SimpleDateFormat;
import java.util.Date;



/**
 * Custom Logger Class with different logging options (depending on severity)
 * 
 * @author www.it-ps.at
 */
public final class Logger {
	
	private static final LogFileHandler LOG_FILE_HANDLER = new LogFileHandler();
	
	/**
	 * Constructor
	 */
	Logger(){}

	//ERROR LOGGING
	/**
	 * Logs an error if Logging is set to true (also uploads the error to PMON)
	 * @param SystemName	System
	 * @param message		Message
	 */
	public static void error(String SystemName, String message) {
			SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
			String date = time.format(new Date());
			String builder = date + " - " + "[" + Thread.currentThread().getName() + "]-" + "[" + SystemName + "]-" + "[ERROR]: " + message;
			LOG_FILE_HANDLER.writeLog(builder, SystemName);
			System.out.println(builder);
	}
	
	/**
	 * Logs an error if Logging is set to true (also uploads the error to PMON)
	 * @param SystemName	System
	 * @param message		Message
	 * @param dataType		DataType
	 */
	public static void error(String SystemName, String message, String dataType) {
			SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
			String date = time.format(new Date());
			String builder = date + " - " + "[" + Thread.currentThread().getName() + "]-" + "[" + SystemName + "]-" + "[ERROR]-" + "[" + dataType + "]: " + message;
			LOG_FILE_HANDLER.writeLog(builder, SystemName);
			System.out.println(builder);
	}
	
	/**
	 * Logs an error if Logging is set to true (not uploading the error to PMON)
	 * @param SystemName	System
	 * @param message		Message
	 * @param dataType		DataType
	 */
	public static void errorNoUpload(String SystemName, String message, String dataType) {
			SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
			String date = time.format(new Date());
			String builder = date + " - " + "[" + Thread.currentThread().getName() + "]-" + "[" + SystemName + "]-" + "[ERROR]-" + "[" + dataType + "]: " + message;
			LOG_FILE_HANDLER.writeLog(builder, SystemName);
			System.out.println(builder);
	}
	
	//WARNING LOGGING
	/**
	 * Logs a warning if Logging is set to true
	 * @param SystemName	System
	 * @param message		Message
	 */
	public static void warning(String SystemName, String message) {
			SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
			String date = time.format(new Date());
			String builder = date + " - " + "[" + Thread.currentThread().getName() + "]-" + "[" + SystemName + "]-" + "[WARNING]: " + message;
			LOG_FILE_HANDLER.writeLog(builder, SystemName);
			System.out.println(builder);
	}
	/**
	 * Logs a warning if Logging is set to true
	 * @param SystemName	System
	 * @param message		Message
	 * @param dataType		DataType
	 */
	public static void warning(String SystemName, String message, String dataType) {
			SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
			String date = time.format(new Date());
			String builder = date + " - " + "[" + Thread.currentThread().getName() + "]-" + "[" + SystemName + "]-" + "[WARNING]-" + "[" + dataType + "]: " + message;
			LOG_FILE_HANDLER.writeLog(builder, SystemName);
			System.out.println(builder);
	}

	/**
	 * Logs a custom Message to a specific Path if Logging is set to true
	 * @param SystemName	System
	 * @param message		Message
	 */
	public static void custom(String SystemName, String message, String path) {
			SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
			String date = time.format(new Date());
			String builder = date + " - " + "[" + Thread.currentThread().getName() + "]-" + "[" + SystemName + "]-" + "[INFO]: " + message;
			LOG_FILE_HANDLER.writeLog(builder, SystemName, path);
			System.out.println(builder);
	}

	//INFO LOGGING
	/**
	 * Logs an info if Logging is set to true
	 * @param SystemName	System
	 * @param message		Message
	 */
	public static void info(String SystemName, String message) {
			SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
			String date = time.format(new Date());
			String builder = date + " - " + "[" + Thread.currentThread().getName() + "]-" + "[" + SystemName + "]-" + "[INFO]: " + message;
			LOG_FILE_HANDLER.writeLog(builder, SystemName);
			System.out.println(builder);
	}
		
	/**
	 * Logs an info if Logging is set to true
	 * @param SystemName	System
	 * @param message		Message
	 * @param dataType		DataType
	 */
	public static void info(String SystemName, String message, String dataType) {
			SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
			String date = time.format(new Date());
			String builder = date + " - " + "[" + Thread.currentThread().getName() + "]-" + "[" + SystemName + "]-" + "[INFO]-" + "[" + dataType + "]: " + message;
			LOG_FILE_HANDLER.writeLog(builder, SystemName);
			System.out.println(builder);
	}
	
	/**
	 * Logs an info if Logging is set to true
	 * @param SystemName	System
	 * @param message		Message
	 */
	public static void writeEmptyInfo(String SystemName, String message) {
			LOG_FILE_HANDLER.writeLog(message, SystemName);
	}
	
	//DEBUG LOGGING
	/**
	 * Logs a debug log if Logging and debug are set to true
	 * @param SystemName	System
	 * @param message		Message
	 */
	public static void debug(String SystemName, String message) {
			SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
			String date = time.format(new Date());
			String builder = date + " - " + "[" + Thread.currentThread().getName() + "]-" + "[" + SystemName + "]-" + "[DEBUG]: " + message;
			LOG_FILE_HANDLER.writeLog(builder, SystemName);
			System.out.println(builder);
	}

	/**
	 * Logs a debug log if Logging and debug are set to true
	 * @param SystemName	System
	 * @param message		Message
	 * @param dataType		DataType
	 */
	public static void debug(String SystemName, String message, String dataType) {
			SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
			String date = time.format(new Date());
			String builder = date + " - " + "[" + Thread.currentThread().getName() + "]-" + "[" + SystemName + "]-" + "[DEBUG]-" + "[" + dataType + "]: " + message;
			LOG_FILE_HANDLER.writeLog(builder, SystemName);
			System.out.println(builder);
	}

	/**
	 * Logs a debug log if Logging and debug are set to true (DOES NOT SHOW UP IN CONSOLE)
	 * @param SystemName	System
	 * @param message		Message
	 */
	public static void writeDebug(String SystemName, String message) {
			SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
			String date = time.format(new Date());
			String builder = date + " - " + "[" + Thread.currentThread().getName() + "]-" + "[" + SystemName + "]-" + "[INFO]: " + message;
			LOG_FILE_HANDLER.writeLog(builder, SystemName);
	}
	
	/**
	 * Logs a debug log if Logging and debug are set to true (DOES NOT SHOW UP IN CONSOLE)
	 * @param SystemName	System
	 * @param message		Message
	 */
	public static void writeDebug(String SystemName, String message, String dataType) {
			SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
			String date = time.format(new Date());
			String builder = date + " - " + "[" + Thread.currentThread().getName() + "]-" + "[" + SystemName + "]-" + "[DEBUG]-" + "[" + dataType + "]: " +message;
			LOG_FILE_HANDLER.writeLog(builder, SystemName);
	}
	
	/**
	 * Writes an unformatted debug Log if Logging and Debug are set to true (DOES NOT SHOW UP IN CONSOLE) 
	 * @param SystemName
	 * @param message
	 */
	public static void writeEmptyDebug(String SystemName, String message) {
			LOG_FILE_HANDLER.writeLog(message, SystemName);
	}
}
