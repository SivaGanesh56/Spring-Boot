package com.siva.org.database.dao;

import com.siva.org.database.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PersonJpa
{
    @PersistenceContext
    EntityManager entityManager;

    public Person findbyId(int id)
    {
        return entityManager.find(Person.class,id);
    }

    public Person insertPerson(Person person)
    {
        return entityManager.merge(person);
    }

    public void deletePerson(int id)
    {
        Person person = findbyId(id);
        entityManager.remove(person);
    }

//    public List<Person> findall()
//    {
//        return entityManager.createQuery("select * from person",Person.class).getResultList();
//    }
}
