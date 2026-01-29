package com.quizapp.unittesting.controller;

import com.quizapp.unittesting.models.Person;
import com.quizapp.unittesting.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;
    @GetMapping("/person")
    public ResponseEntity<List<Person>> getAllPerson(){
        return new ResponseEntity<>(personService.getAllPerson(), HttpStatus.OK);
    }
}
