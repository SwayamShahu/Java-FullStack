package com.quizapp.unittesting.service;

import com.quizapp.unittesting.models.Person;
import com.quizapp.unittesting.repository.PersonRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepo personRepo;
    public List<Person> getAllPerson(){
        return personRepo.findAll();
    }

    public void DeleteById(int i) {
        personRepo.deleteById(i);
    }

    public Person save(Person person){
        Person newPerson = new Person();
        newPerson.setCity(person.getCity());
        newPerson.setName(person.getName());
        return personRepo.save(newPerson);
    }
}
