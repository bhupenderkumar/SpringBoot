package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Matches;
import com.example.model.Role;

@Repository("MatchRepository")
public interface MatchRepository extends JpaRepository<Matches, Integer>{
	

}
