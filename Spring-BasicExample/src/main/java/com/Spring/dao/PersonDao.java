package com.Spring.dao;

import com.Spring.model.Person;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao
{
    int insertPerson(UUID id, Person person);
    default int insertPerson(Person person)
    {
        UUID uuid = UUID.randomUUID();
        return insertPerson(uuid,person);
    }
    List<Person>selectAllPeople();

   Optional<Person> selectPersonById(UUID id);

   int deletePersonById(UUID id);
   int updatePerson(UUID id, Person person);

}
