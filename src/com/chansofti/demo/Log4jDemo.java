package com.chansofti.demo;

import org.apache.log4j.Logger;

public class Log4jDemo 
{
	static Logger logger = Logger.getLogger ( Log4jDemo.class.getName () );
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
			System.out.println(100/0);
		}catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
			//记录info级别信息
			logger.info(e);
			//记录debug级别信息
			logger.debug(e);
			//记录error级别信息
			logger.error(e);
			//记录warn级别信息
			logger.warn(e);
			
			
		}
	}

}
