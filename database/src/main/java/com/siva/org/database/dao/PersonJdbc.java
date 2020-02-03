package com.siva.org.database.dao;

import com.siva.org.database.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

@Repository
public class PersonJdbc
{
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Person>getall()
    {
        return jdbcTemplate.query("SELECT * FROM person",new BeanPropertyRowMapper<Person>(Person.class));
    }

    public Person getbyId(int id)
    {
        return jdbcTemplate.queryForObject("SELECT * FROM PERSON WHERE ID=?",new Object[]{id},
                                                        new BeanPropertyRowMapper<Person>(Person.class));
    }

    public int deleteById(int id)
    {
        return jdbcTemplate.update("delete from person where id=?",new Object[]{id});
    }

    public List<Map<String, Object>> inRange(int a , int b)
    {
        return jdbcTemplate.queryForList("select * from person where id between ? and ?",new Object[]{a,b});
    }


    public int insertPerson(Person person)
    {
       return jdbcTemplate.update("insert into person (id,name,location,birth_date) values(?,?,?,?)",
                                new Object[]{person.getId(),person.getName(),person.getLocation(),
            new Timestamp(person.getBirth_date().getTime() )} );
    }

    public int updatePerson(Person person)
    {
        return jdbcTemplate.update("update person set name=?,location=? where id =?",
                new Object[]{person.getName(),person.getLocation(),person.getId()});
    }


}
