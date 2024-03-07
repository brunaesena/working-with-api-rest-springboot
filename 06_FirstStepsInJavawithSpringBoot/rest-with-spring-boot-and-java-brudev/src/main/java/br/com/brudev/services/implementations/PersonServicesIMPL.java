package br.com.brudev.services.implementations;

import br.com.brudev.model.Person;
import br.com.brudev.services.PersonServices;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Component
public class PersonServicesIMPL implements PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private final Logger logger = Logger.getLogger(PersonServices.class.getName());
    @Override
    public List<Person> findAll() {

        logger.info("Finding all people");
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    @Override
    public Person findById(String id) {

        logger.info("Fnding one person!");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Carlos");
        person.setLastName("Fereira");
        person.setAdress("Campinas - Sao Paulo - Brasil");
        person.setGender("Male");
        return person;
    }

    @Override
    public Person createPerson(Person person){
        logger.info("Creating one person!");

        return person;
    }

    @Override
    public Person updatePerson(Person person){
        logger.info("Updating one person!");

        return person;
    }

    @Override
    public void deletePerson(String id){
        logger.info("Deleting one person!");
    }

    @Override
    public Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Person name" + i);
        person.setLastName("Last Name" + 1);
        person.setAdress("Somewhere in Brazil");
        if (i%2 != 0) {
            person.setGender("F");
        }else {
            person.setGender("M");
        }
        return person;
    }
}
