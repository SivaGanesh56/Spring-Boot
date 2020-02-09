package imperative;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main
{

    public static void main(String[] args)
    {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Siva",Gender.MALE));
        people.add(new Person("Ganesh",Gender.MALE));
        people.add(new Person("Kajal",Gender.FEMALE));
        people.add(new Person("Sam",Gender.FEMALE));
        people.add(new Person("Prabhas",Gender.MALE));


        //Imperative Apporach

        List<Person> females = new ArrayList<>();
        for(Person person:people)
        {
            if(Gender.FEMALE.equals(person.gender))
            {
                females.add(person);
            }
        }


        //print result

        for(Person person:females)
        {
            System.out.println(person);
        }

        /// Decalrativr Apporach --> Streams+Collections
        System.out.println("Decalarative Apporach");

        //Predicate<Person> predicate = p -> Gender.FEMALE.equals(p.gender);
        //people.stream().filter(p->p.gender.equals(Gender.FEMALE)).forEach(System.out::println);
        //List<Person> feamles2 = people.stream().filter(predicate).collect(Collectors.toList());
        List<Person> feamles2 = people.stream().filter(p->Gender.FEMALE.equals(p.gender)).collect(Collectors.toList());
        feamles2.forEach(System.out::println);


    }

    static class Person
    {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender
    {
        MALE,FEMALE
    }
}
