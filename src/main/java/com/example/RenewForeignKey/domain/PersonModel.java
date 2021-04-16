package com.example.RenewForeignKey.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

//@Getter
//@Setter
@Entity
@Table(name = "person_tbl")
public class PersonModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstname;
    private String lastname;


    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private InformationModel informationModel; //user table

    public PersonModel(Integer id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;

    }

    public Integer getId() {
        return id;
    }

    public PersonModel setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public PersonModel setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public PersonModel setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public InformationModel getInformationModel() {
        return informationModel;
    }

    public void setInformationModel(InformationModel informationModel) {
        this.informationModel = informationModel;
    }

    public PersonModel() {
    }
}
