package com.nf.footballStatistics.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nf.footballStatistics.model.Player;
import com.nf.footballStatistics.service.PlayerService;

@RestController
@RequestMapping(value = "/players")
public class PlayerController {
	
	@Autowired
	private PlayerService playerService;

	@GetMapping
	public List<Player> getPlayers() {		
		return playerService.getPlayers();
	}
	
	@GetMapping(value = "/{playerId}")
	public Player getPlayer(@PathVariable("playerId") int playerId) {		
		return playerService.getPlayer(playerId);
	}
	
	@PostMapping
	public Player addPlayer(@RequestBody Player player) {
		return playerService.addPlayer(player);
	}
	
	@DeleteMapping(value = "/{playerId}")
	public void deletePlayerById(@PathVariable("playerId") int playerId) {
		playerService.deletePlayerByID(playerId);
	}
	
	@PutMapping(value = "/{playerId}")
	public Player editPlayerById(@RequestBody Player player, @PathVariable("playerId") int playerId) {
		return playerService.editPlayerById(player, playerId);
	}
}
