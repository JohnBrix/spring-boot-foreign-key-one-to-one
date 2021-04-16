package com.example.RenewForeignKey.dto;




public class PersonDto {
    private Integer id;
    private String firstname;
    private String lastname;
    private Integer age;
    private String hobby;

    public Integer getId() {
        return id;
    }

    public PersonDto setId(Integer id) {
        this.id = id;
        return  this;
    }

    public String getFirstname() {
        return firstname;
    }

    public PersonDto setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public PersonDto setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public PersonDto setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getHobby() {
        return hobby;
    }

    public PersonDto setHobby(String hobby) {
        this.hobby = hobby;
        return this;
    }
}
