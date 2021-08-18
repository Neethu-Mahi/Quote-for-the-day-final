package com.kidsbuddy.mvc.rest.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.kidsbuddy.mvc.rest.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	@Query(value="select w.word_sentence from word w, user u where u.user_id = :id and u.word_id = w.word_id and datediff(day,u.last_picked_date,curdate()) = 0",nativeQuery=true)
	public String findByIdAndLastPickedDate(@Param("id") int id);

	public Optional<User> findByUserId(int id);
}
