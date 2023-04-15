package br.com.amaral.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.amaral.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {}