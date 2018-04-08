package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import groovy.transform.EqualsAndHashCode;

@Entity
@Table(name = "iplTeams")
public class IPLTeams {
	@Id
	@Column(name = "id")
	private int id;
	private String teamNames;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeamName() {
		return teamNames;
	}

	public void setTeamName(String teamNames) {
		this.teamNames = teamNames;
	}

}
