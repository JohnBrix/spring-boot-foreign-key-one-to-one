package com.example.RenewForeignKey.repository;

import com.example.RenewForeignKey.domain.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonModel,Integer> {
}
