package com.service_two.servicetwo.repo;

import com.service_two.servicetwo.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person,Long> {
    Person findPersonByName(String name);
}
