package com.kidsbuddy.mvc.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kidsbuddy.mvc.rest.entity.Word;
import com.kidsbuddy.mvc.rest.exception.NoSuchWordException;
import com.kidsbuddy.mvc.rest.repository.WordRepository;

/**
 * This controller class handles all the request
 * mapped to the word
 * @author Neethu H
 *
 */

@RestController
public class WordController {
	
	@Autowired
	private WordRepository wordRepository;
	
	@GetMapping("/words")
	public List<Word> getAllWords(){
		return (List<Word>) wordRepository.findAll();
	}
	
	@GetMapping("/word/{id}")
	public Word getUserById(@PathVariable("id") int id) {
		Optional<Word>  word = wordRepository.findById(id);
	
		if (!word.isPresent()) throw new NoSuchWordException("No such word exists for the id = "+id);
		
		return word.get();
	}
	
}
