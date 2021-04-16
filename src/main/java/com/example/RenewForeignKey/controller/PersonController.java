package com.example.RenewForeignKey.controller;

import com.example.RenewForeignKey.dto.PersonDto;
import com.example.RenewForeignKey.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2/person")
@CrossOrigin(origins = {"http://localhost:8082",}, maxAge = 3000)
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public ResponseEntity savePerson(@RequestBody PersonDto personDto) {

        return new ResponseEntity(personService.save(personDto), HttpStatus.OK);
    }
}
