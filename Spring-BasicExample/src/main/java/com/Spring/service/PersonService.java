package com.Spring.service;

import com.Spring.dao.PersonDao;
import com.Spring.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PersonService
{
    private final PersonDao personDao;


    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person)
    {
        return personDao.insertPerson(person);
    }

    public List<Person> getAllPeople()
    {
        return personDao.selectAllPeople();
    }

    public Person selectPersonById(UUID id)
    {
        return personDao.selectPersonById(id).orElse(null);
    }

    public int deletePerson(UUID uuid)
    {
        return personDao.deletePersonById(uuid);
    }

    public int updatePerson(UUID id,Person person)
    {
        return personDao.updatePerson(id,person);
    }

}
