package com.techcielo.sprhn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringHibernateApp {

    private static final Logger logger = LoggerFactory.getLogger(SpringHibernateApp.class);

    public static void main(String args[]){
        logger.info("Starting Spring-Hibernate application");
        SpringApplication.run(SpringHibernateApp.class);
    }
}
