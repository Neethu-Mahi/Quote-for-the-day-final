package com.kidsbuddy.mvc.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Word {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int wordId;
	
	@Column 
	private String wordPhrase;
	
	/**
	 * @return the wordId
	 */
	public int getWordId() {
		return wordId;
	}

	/**
	 * @param wordId the wordId to set
	 */
	public void setWordId(int wordId) {
		this.wordId = wordId;
	}

	/**
	 * @return the wordPhrase
	 */
	public String getWordPhrase() {
		return wordPhrase;
	}

	/**
	 * @param wordPhrase the wordPhrase to set
	 */
	public void setWordPhrase(String wordPhrase) {
		this.wordPhrase = wordPhrase;
	}

	/**
	 * @return the wordSentence
	 */
	public String getWordSentence() {
		return wordSentence;
	}

	/**
	 * @param wordSentence the wordSentence to set
	 */
	public void setWordSentence(String wordSentence) {
		this.wordSentence = wordSentence;
	}

	@Column
	private String wordSentence;

	@Override
	public String toString() {
		return "Word [wordId=" + wordId + ", wordPhrase=" + wordPhrase + ", wordSentence=" + wordSentence + "]";
	}
	
}
