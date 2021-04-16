package com.example.RenewForeignKey.service;

import com.example.RenewForeignKey.domain.PersonModel;
import com.example.RenewForeignKey.dto.PersonDto;
import com.example.RenewForeignKey.mapper.PersonMapper;
import com.example.RenewForeignKey.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PersonMapper personMapper;



    @Override
    public PersonDto save(PersonDto personDto) {

        PersonModel personModel = new PersonModel();

        PersonModel user = this.personMapper.fromCreateUserDtoToUserEntity(personDto);
        personModel = this.personRepository.save(user);
        return this.personMapper.fromPersonDtoToEntity(personModel);
    }
}
