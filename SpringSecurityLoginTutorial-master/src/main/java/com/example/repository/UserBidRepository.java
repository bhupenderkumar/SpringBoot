package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.User;
import com.example.model.UserChoiceMatch;

@Repository("userBidRepository")
public interface UserBidRepository extends JpaRepository<UserChoiceMatch, Integer> {

}
