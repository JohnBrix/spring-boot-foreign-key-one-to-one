package com.example.RenewForeignKey.mapper;

import com.example.RenewForeignKey.domain.InformationModel;
import com.example.RenewForeignKey.domain.PersonModel;
import com.example.RenewForeignKey.dto.PersonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class PersonMapper {

    public PersonDto fromPersonDtoToEntity(PersonModel personModel) {

        return new PersonDto()
                .setId(personModel.getId())
                .setFirstname(personModel.getFirstname())
                .setLastname(personModel.getLastname())
                .setAge(personModel.getInformationModel().getAge())
                .setHobby(personModel.getInformationModel().getHobby());

    }

    public PersonModel fromCreateUserDtoToUserEntity(PersonDto personDto) {
        PersonModel personModel = new PersonModel();
        InformationModel informationModel = new InformationModel();

        personModel.setFirstname(personDto.getFirstname());
        personModel.setLastname(personDto.getLastname());
        informationModel.setAge(personDto.getAge());
        informationModel.setHobby(personDto.getHobby());
        informationModel.setUser(personModel); //this is connect to one to one

        //make a list for foreign key here to display as list

        personModel.setInformationModel(informationModel);

        return personModel;
    }

}
