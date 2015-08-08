package com.techcielo.hibernate5.test;

import junit.framework.TestCase;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.techcielo.sprhn.bean.Categories;
import com.techcielo.sprhn.util.HibernateUtil;

public class MainTest extends TestCase{
	
	private static Logger logger = LoggerFactory.getLogger(MainTest.class);
	
	@Override
	protected void setUp() throws Exception {
		logger.debug("Setting up");
	}
	
	public void testCategories() {
		logger.debug("Starting main class");
		Session sess = null;
		try{
			sess = HibernateUtil.getSession();
			logger.debug("Got the session...");
			Categories cat = sess.get(Categories.class, 1);
			logger.debug("Got the category {}",cat);
		}
		catch(HibernateException e){
			logger.error("Error occured",e);
		}finally{
			logger.debug("Closing the session..");
			sess.close();
			sess.getSessionFactory().close();
		}
		logger.debug("Got the session");
	}
}
