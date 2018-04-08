package com.example.controller;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.repository.core.support.ExampleMatcherAccessor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.IPLTeams;
import com.example.model.User;
import com.example.model.UserChoiceMatch;
import com.example.repository.IPLTeamsRepository;
import com.example.repository.UserBidRepository;

@Controller
@RestController
public class BidController {

	@Autowired
	private UserBidRepository bidRepository;
	@Autowired
	private IPLTeamsRepository iplTeamsRepository;

	@RequestMapping(value = "/bid/userbid", method = RequestMethod.POST)
	public ModelAndView createNewUser(@Valid UserChoiceMatch choiceMatch, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		if (bindingResult.hasErrors()) {
			System.out.println(bindingResult.getAllErrors());
		} else {
			bidRepository.saveAndFlush(choiceMatch);
			modelAndView.addObject("successMessage", "satta Created Successfully");
			modelAndView.addObject("user", new User());
		}
		modelAndView.setViewName("admin/bid");
		return modelAndView;
	}

	@RequestMapping(value = { "/admin/seeOtherBid" }, method = RequestMethod.GET)
	public ModelAndView findAllBid() {
		ModelAndView modelAndView = new ModelAndView();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		modelAndView.addObject("adminMessage", "Content Available Only for Users with Admin Role");
		modelAndView.setViewName("admin/seeOtherBid");
		modelAndView.addObject("allBids", bidRepository.findAll());
		return modelAndView;
	}

	@RequestMapping(value = { "/admin/getTeamsByMatch" }, method = RequestMethod.GET)
	public List<IPLTeams> getTeamsByMatch(@Valid Integer matchid) {
		if (matchid == null)
			matchid = 1;
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		// return iplTeamsRepository.findById(matchid);
		return iplTeamsRepository.findAll();
		// iplTeamsRepository.findAll(example)
	}

}
