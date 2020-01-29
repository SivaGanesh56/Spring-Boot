package com.Spring.api;

import com.Spring.model.Person;
import com.Spring.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequestMapping("/api/v1/person")
@RestController
public class PersonController
{
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    @PostMapping
     public void addPerson(@RequestBody @NotNull @Valid  Person person)
     {
         personService.addPerson(person);
     }

     @GetMapping
     public List<Person>getAllPeople()
     {
         return personService.getAllPeople();
     }


     @GetMapping(path = "{id}")
     public Person selectpersonbyId(@PathVariable("id") UUID id)
     {
         return personService.selectPersonById(id);
     }

     @DeleteMapping(path = "{id}")
     public int deletePersonById(@PathVariable("id") UUID id)
     {
         return personService.deletePerson(id);
     }

     @PutMapping(path = "{id}")
     public int updateById(@PathVariable UUID id,@Valid @NotNull @RequestBody Person person)
     {
         return personService.updatePerson(id,person);
     }
}
