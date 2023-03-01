package com.liquiddb.liquiddemo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {

    @Query("SELECT name FROM Person s WHERE s.name LIKE %:personName%")
    String findByName(String personName);
}
