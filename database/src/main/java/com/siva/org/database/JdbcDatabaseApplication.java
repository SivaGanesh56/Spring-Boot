package com.siva.org.database;

import com.siva.org.database.dao.PersonJdbc;
import com.siva.org.database.entity.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

//@SpringBootApplication
public class JdbcDatabaseApplication implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbc personJdbc;

	public static void main(String[] args)
	{
		SpringApplication.run(JdbcDatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		logger.info("ALl-->{}",personJdbc.getall());
		logger.info("ById-->{}",personJdbc.getbyId(131));
		logger.info("delete by-->{}",personJdbc.deleteById(12));
		logger.info("In range--->{}",personJdbc.inRange(10,100));
		logger.info("Insert new 133-->{}",personJdbc.insertPerson(new Person(133,"Sai","EG",new Date())));
		logger.info("Update user 131-->{}",personJdbc.updatePerson(new Person(131,"MSG","Hitech City",new Date())));
		logger.info("ALl-->{}",personJdbc.getall());
	}
}
