package com.kidsbuddy.mvc.rest.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	
	@Column 
	private String userName;
	@Column
	private int wordId;
	@Column
	private Date lastPickedDate;
	
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
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
	 * @return the lastPickedDate
	 */
	public Date getLastPickedDate() {
		return lastPickedDate;
	}

	/**
	 * @param lastPickedDate the lastPickedDate to set
	 */
	public void setLastPickedDate(Date lastPickedDate) {
		this.lastPickedDate = lastPickedDate;
	}
	
}
