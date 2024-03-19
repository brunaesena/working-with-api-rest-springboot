package br.com.brudev.services.implementations;

import br.com.brudev.exceptions.ResourceNotFoundException;
import br.com.brudev.models.Person;
import br.com.brudev.repositories.PersonRepository;
import br.com.brudev.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.logging.Logger;

@Component
public class PersonServicesIMPL implements PersonServices {
    private final Logger logger = Logger.getLogger(PersonServices.class.getName());

    @Autowired
    PersonRepository repository;

    @Override
    public List<Person> findAll() {

        logger.info("Finding all people");

        return repository.findAll();
    }

    @Override
    public Person findById(Long id) {

        logger.info("Fnding one person!");

        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
    }

    @Override
    public Person createPerson(Person person){
        logger.info("Creating one person!");

        return repository.save(person);
    }

    @Override
    public Person updatePerson(Person person){

        Person entity = repository.findById(person.getId())
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));

        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAdress(person.getAdress());
        entity.setGender(person.getGender());

        logger.info("Updating one person!");

        return repository.save(person);
    }

    @Override
    public void deletePerson(Long id){

        logger.info("Deleting one person!");

        Person entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));

        repository.delete(entity);
    }
}
