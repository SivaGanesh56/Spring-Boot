package com.siva.org.database;

import com.siva.org.database.dao.PersonJpa;
import com.siva.org.database.entity.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class JpaDatabaseApplication implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(Person.class);

	@Autowired
	PersonJpa personJpa;

	public static void main(String[] args) {
		SpringApplication.run(JpaDatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("getById(131)--->{}",personJpa.findbyId(131));
		logger.info("insert new one-->{}",personJpa.insertPerson(new Person("Sumanth","TDP",new Date())));
		logger.info("Update new one-->{}",personJpa.insertPerson(new Person(1,"Messi	","TDP",new Date())));
		personJpa.deletePerson(1);
		//logger.info("Get all-->{}",personJpa.findall());
	}
}
