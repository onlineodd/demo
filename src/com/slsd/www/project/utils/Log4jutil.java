package com.slsd.www.project.utils;

import org.apache.log4j.Logger;

public class Log4jutil {
static Logger logger;
public static Logger getInstance(String clazzName){
	return Logger.getLogger(clazzName);
}
}
