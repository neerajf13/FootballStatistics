package com.nf.footballStatistics.model;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty("id")
	public int playerId;
	
	@JsonProperty("firstName")
	public String firstName;
	
	@JsonProperty("lastName")
	public String lastName;
	
	@JsonProperty("age")
	public int age;
	
//	@JsonProperty("dob")
//	public Date dob;
	
//	public Date getDob() {
//		return dob;
//	}
//	public void setDob(Date dob) {
//		this.dob = dob;
//	}
	@JsonProperty("country")
	public String nationality;
	
	@JsonProperty("club")
	public String club;
	
	@JsonProperty("clubJerseyNumber")
	public int jerseryNumClub;
	
	@JsonProperty("countryJerseyNumber")
	public int jerseyNumNational;	
	
	@JsonProperty("preferredFoot")
	public String preferredFoot;
	  
	@JsonProperty("playerType")
	public String playerType;	
	
	public String getPreferredFoot() {
		return preferredFoot;
	}
	public void setPreferredFoot(String preferredFoot) {
		this.preferredFoot = preferredFoot;
	}
	public String getPlayerType() {
		return playerType;
	}
	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}
	
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	public int getJerseryNumClub() {
		return jerseryNumClub;
	}
	public void setJerseryNumClub(int jerseryNumClub) {
		this.jerseryNumClub = jerseryNumClub;
	}
	public int getJerseyNumNational() {
		return jerseyNumNational;
	}
	public void setJerseyNumNational(int jerseyNumNational) {
		this.jerseyNumNational = jerseyNumNational;
	}

}
