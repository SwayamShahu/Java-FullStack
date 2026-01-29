package com.quizapp.unittesting.repository;

import com.quizapp.unittesting.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> {
//    boolean existsById(Integer personId);
//    Person findByName(String name);
}
