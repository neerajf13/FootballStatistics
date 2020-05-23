package com.nf.footballStatistics.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.nf.footballStatistics.dao.PlayerDAO;
import com.nf.footballStatistics.model.Player;

@Component
public class PlayerService {
	
	@Autowired
	PlayerDAO playerDAO;
	
	public List<Player> getPlayers() {		
		return playerDAO.findAll();
	}
	
	public Player getPlayer(int playerId) {		
		return playerDAO.findById(playerId).get();
	}
	
	public Player addPlayer(Player player) {	
		return playerDAO.save(player);		
	}
	
	public void deletePlayerByID(int playerId) {
		playerDAO.deleteById(playerId);
	}	
	
	public Player editPlayerById(Player player, int playerId) {		
		Player updatedPlayer = player;
		updatedPlayer.setPlayerId(playerId);
		return playerDAO.save(updatedPlayer);
	}
}
