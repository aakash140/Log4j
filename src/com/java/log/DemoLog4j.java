package com.java.log;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;


public class DemoLog4j {
	private static Logger log = Logger.getLogger(DemoLog4j.class);
	public static void main(String[] args)throws IOException {
	logMethod();
	}
	
	protected static void logMethod()throws IOException{
		Layout layout=new PatternLayout();
		Appender appender=new FileAppender(layout,"C:/Documents and Settings/akash.gupta/Desktop/abc.log",false);
		log.addAppender(appender);
		log.fatal("This is fatal message");
	}
}