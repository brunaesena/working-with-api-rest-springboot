package br.com.brudev.services;

import br.com.brudev.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonServices {
    Person findById(String id);
    List<Person> findAll();

    Person updatePerson(Person person);

    void deletePerson(String id);

    Person mockPerson(int i);

    Person createPerson(Person person);
}
