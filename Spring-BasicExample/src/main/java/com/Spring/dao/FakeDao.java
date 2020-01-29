package com.Spring.dao;

import com.Spring.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FakeDao implements PersonDao
{
    private static List<Person>DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id,person.getName()));
        return 1;
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return DB.stream().filter(Person->Person.getId().equals(id)).findFirst();
    }

    @Override
    public int updatePerson(UUID id,Person person)
    {
        return selectPersonById(id).map(p->
        {
            int ind = DB.indexOf(p);
            if(ind>=0)
            {
                DB.set(ind,person);
                return 1;
            }
            return 0;
        }).orElse(0);
    }

    @Override
    public int deletePersonById(UUID id) {
        Optional<Person> personMaybe=selectPersonById(id);
        if(personMaybe.isPresent())
        {
            DB.remove(personMaybe);
            return 1;
        }
        return 0;
    }

    @Override
    public List<Person> selectAllPeople() {
        return DB;
    }
}
