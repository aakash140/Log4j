package com.java.logProperties;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;


public class DemoLog4j {
	private static Logger l = Logger.getLogger(DemoLog4j.class);
	public static void main(String[] args)throws IOException {
	logMethod();
	}
	
	protected static void logMethod()throws IOException{
		  l.debug("This is debug message");
	      l.info("This is info message");
	      l.warn("This is warn message");
	      l.fatal("This is fatal message");
	      l.error("This is error message");
	 
	      System.out.println("Your logic executed successfully....");
	}
}