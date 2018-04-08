package com.example.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import groovy.transform.EqualsAndHashCode;

@Entity
@Table(name = "matches")

public class Matches {
	public int getId() {
		return id;
	}
	// 1kkr
	// 2dd
	// 3mi
	// 4csk
	// 5rr

	private Integer price;
	private Integer firstTeamId;
	private Integer secondTeamId;
	private Integer whoWon;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	private String matchdesc;
	@Column
	private Date matchDate;

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Date getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMatchdesc() {
		return matchdesc;
	}

	public Integer getWhoWon() {
		return whoWon;
	}

	public void setWhoWon(Integer whoWon) {
		this.whoWon = whoWon;
	}

	public Integer getFirstTeamId() {
		return firstTeamId;
	}

	public void setFirstTeamId(Integer firstTeamId) {
		this.firstTeamId = firstTeamId;
	}

	public Integer getSecondTeamId() {
		return secondTeamId;
	}

	public void setSecondTeamId(Integer secondTeamId) {
		this.secondTeamId = secondTeamId;
	}

	public void setMatchdesc(String matchdesc) {
		this.matchdesc = matchdesc;
	}

}
