package de.msg.demo;

import org.springframework.data.repository.Repository;

public interface PersonRepository extends Repository<Person, Long> {

    <S extends Person> S save(S person);
    Person findOne(Long id);
}