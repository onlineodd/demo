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
			//��¼info������Ϣ
			logger.info(e);
			//��¼debug������Ϣ
			logger.debug(e);
			//��¼error������Ϣ
			logger.error(e);
			//��¼warn������Ϣ
			logger.warn(e);
			
			
		}
	}

}
