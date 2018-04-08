package com.example.rest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.IPLTeams;
import com.example.repository.IPLTeamsRepository;

@RestController
public class BidResource {

	@Autowired
	private IPLTeamsRepository iplTeamRepositry;

	// @GetMapping("/admin/getTeamsByMatch")
	// public List<Student> retrieveAllStudents() {
	// return studentRepository.findAll();
	// }

	@GetMapping("/admin/getTeamsByMatch/{id}")
	public IPLTeams retrieveStudent(@PathVariable Integer id) {
		return iplTeamRepositry.findOne(id);
	}
}