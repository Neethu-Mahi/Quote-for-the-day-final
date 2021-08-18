package com.kidsbuddy.mvc.rest.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kidsbuddy.mvc.rest.entity.User;
import com.kidsbuddy.mvc.rest.entity.Word;
import com.kidsbuddy.mvc.rest.exception.UserNotFoundException;
import com.kidsbuddy.mvc.rest.repository.UserRepository;
import com.kidsbuddy.mvc.rest.repository.WordRepository;

/**
 * This controller class handles all the request
 * mapped to the user details
 * @author Neethu H
 *
 */
@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private WordRepository wordRepository;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return (List<User>) userRepository.findAll();
	}
	
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable("id") int id) {
		Optional<User>  user = userRepository.findById(id);
	
		if (!user.isPresent()) throw new UserNotFoundException("user not found exception for the id = "+id);
		
		return user.get();
	}
	
	@GetMapping("/user/{id}/quote-of-the-day")
	public String wordOfDay(@PathVariable("id") int id) {
		int minimum		= 0;
		int maximum		= 0;
		Optional<User>  user = userRepository.findByUserId(id);

		if (!user.isPresent()) throw new UserNotFoundException("user not found exception for the id = "+id);
		User    u 		=	user.get();
		String  word 	=	userRepository.findByIdAndLastPickedDate(id);
	
		if (word == null) {
			List<Word>  words = (List<Word>) wordRepository.findAll();
			maximum  	= words.size() - 1;
			int rand    =  minimum + (int)(Math.random() * (maximum - minimum));
			Word w 		= words.get(rand);
			word 		= w.getWordSentence();
			u.setWordId(w.getWordId());
			u.setLastPickedDate(new Date());
			userRepository.save(u);
		}
		
		return word;
	}
	
}
