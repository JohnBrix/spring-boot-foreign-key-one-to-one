package com.example.RenewForeignKey.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.Constraint;
import java.util.List;
import java.util.UUID;

//@Getter
//@Setter
@Entity
@Table(name = "information_tbl")
public class InformationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Integer id;
    private Integer age;
    private String hobby;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private PersonModel user;

    public Integer getId() {
        return id;
    }

    public InformationModel setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public InformationModel setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getHobby() {
        return hobby;
    }

    public InformationModel setHobby(String hobby) {
        this.hobby = hobby;
        return this;
    }

    public PersonModel getUser() {
        return user;
    }

    public InformationModel setUser(PersonModel user) {
        this.user = user;
        return this;
    }
}
