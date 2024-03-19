package br.com.brudev.services;

import br.com.brudev.models.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonServices {

    Person findById(Long id);
    List<Person> findAll();

    Person updatePerson(Person person);

    void deletePerson(Long id);

    Person createPerson(Person person);
}
