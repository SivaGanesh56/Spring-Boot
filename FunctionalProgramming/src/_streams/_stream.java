package _streams;
import java.util.ArrayList;
import java.util.List;

import static _streams._stream.Gender.FEMALE;
import static _streams._stream.Gender.OTHER;

public class _stream
{
    public static void main(String[] args)
    {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Siva", Gender.MALE));
        people.add(new Person("Ganesh", Gender.MALE));
        people.add(new Person("Kajal", FEMALE));
        people.add(new Person("Sam", FEMALE));
        people.add(new Person("Prabhas",Gender.MALE));
       // people.add(new Person("****",Gender.OTHER));


       //people.stream().map(person -> person.name).mapToInt(String::length).forEach(System.out::println);

        boolean b = people.stream().noneMatch(person -> OTHER.equals(person.gender));
        System.out.println(b);

    }

    static class Person
    {
        private final String name;
        private final Gender gender;

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
    }

    enum Gender
    {
        MALE,FEMALE,OTHER
    }
}
