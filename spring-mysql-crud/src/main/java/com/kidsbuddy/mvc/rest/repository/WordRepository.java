package com.kidsbuddy.mvc.rest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.kidsbuddy.mvc.rest.entity.Word;

@Repository
public interface WordRepository extends CrudRepository<Word,Integer>{


}
