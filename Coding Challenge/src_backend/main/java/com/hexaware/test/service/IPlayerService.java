package com.hexaware.test.service;

import java.util.List;

import com.hexaware.test.dto.PlayerDto;
import com.hexaware.test.entity.Player;

public interface IPlayerService {
	
	public Player addPlayer(PlayerDto playerdto);
	public Player updatePlayer(PlayerDto playerdto);
	public void deletePlayerById(int id);
	public Player getPlayerById(int id);
	public List<Player> getAllPlayer();
	public void deletePlayerByRole(String playerName,String teamName);

}
