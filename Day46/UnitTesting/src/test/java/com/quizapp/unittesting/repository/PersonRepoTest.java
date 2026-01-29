package com.quizapp.unittesting.repository;

import com.quizapp.unittesting.models.Person;
import com.quizapp.unittesting.service.PersonService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willDoNothing;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class PersonRepoTest {
    @Mock
    private PersonRepo personRepo;
    @InjectMocks
    private PersonService personService;

    @Test
    void getAllPerson(){
        Person person1 = new Person(null, "P1", "city1");
        Person person2 = new Person(null, "P2", "city2");
        given(personRepo.findAll()).willReturn(List.of(person1, person1));
        List<Person> personList = personService.getAllPerson();
        assertThat(personList).isNotNull();
        assertThat(personList.size()).isEqualTo(2);
        verify(personRepo).findAll();
    }

    @Test
    void deleteById(){
        willDoNothing().given(personRepo).deleteById(1);
        personService.DeleteById(1);
        verify(personRepo).deleteById(1);
    }

    @Test
    void shouldSavePerson(){
        Person input = new Person(null, "Rahul", "Nagpur");
        Person saved = new Person(10, "Rahul", "Pune");

        given(personRepo.save(input)).willReturn(saved);
        personService.save(input);
        Person result = personRepo.save(input);
        assertThat(result.getPersonId()).isEqualTo(10);
              verify(personRepo).save(input);
    }
}
