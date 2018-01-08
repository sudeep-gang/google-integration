package com.googleintrigation.test.repository;

import java.io.Serializable;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.googleintrigation.test.domain.Person;



@RepositoryRestResource(path="/api/person")
public interface PersonRepository extends Serializable,PagingAndSortingRepository<Person, Long>{

}
