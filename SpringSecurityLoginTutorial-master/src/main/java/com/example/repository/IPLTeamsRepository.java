package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.IPLTeams;
import com.example.model.Matches;
import com.example.model.Role;

@Repository("IPLTeamsRepository")
public interface IPLTeamsRepository extends JpaRepository<IPLTeams, Integer> {

//	@Query("select teamNames from IPLTeams where id in (select firstTeamId , secondTeamId from Matches where id=?1 ) ")
//	public List<IPLTeams> findAll(Integer matchId);

//	public List<IPLTeams> findById(Integer matchId);
}
