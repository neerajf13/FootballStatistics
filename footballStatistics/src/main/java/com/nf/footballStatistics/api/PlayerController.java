package com.nf.footballStatistics.api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

	@RequestMapping(value = "/players")
	public String getPlayers() {
		
		return "List of Players";
	}
	
}
