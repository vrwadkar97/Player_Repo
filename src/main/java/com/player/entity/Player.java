package com.player.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer playerId;
	private String firstName;
	private String lastName;
	private Integer jerseyNum;
	private String clubName;
	private String countryName;
	private Long mobNum;
	
	public Integer getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Integer playerId) {
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
	public Integer getJerseyNum() {
		return jerseyNum;
	}
	public void setJerseyNum(Integer jerseyNum) {
		this.jerseyNum = jerseyNum;
	}
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public Long getMobNum() {
		return mobNum;
	}
	public void setMobNum(Long mobNum) {
		this.mobNum = mobNum;
	}
	
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", firstName=" + firstName + ", lastName=" + lastName + ", jerseyNum="
				+ jerseyNum + ", clubName=" + clubName + ", countryName=" + countryName + ", mobNum=" + mobNum + "]";
	}
//	public Player(Integer playerId, String firstName, String lastName, Integer jerseyNum, String clubName,
//			String countryName, Long mobNum) {
//		super();
//		this.playerId = playerId;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.jerseyNum = jerseyNum;
//		this.clubName = clubName;
//		this.countryName = countryName;
//		this.mobNum = mobNum; 
//	}
	
	
	

}
