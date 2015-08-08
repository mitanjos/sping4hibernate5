package com.techcielo.sprhn.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HibernateUtil {
	private static Logger logger = LoggerFactory.getLogger(HibernateUtil.class);
	private static SessionFactory fac = null;
	
	public static Session getSession(){
		
		logger.debug("Creating Session Factory");
		
		if(fac==null){
			fac = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		logger.debug("Session Factory Created");
		if(fac!=null){
			return fac.openSession();
		}else{
			return null;
		}
	}
}
