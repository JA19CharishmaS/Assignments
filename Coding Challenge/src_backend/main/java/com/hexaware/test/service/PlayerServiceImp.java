package com.hexaware.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.test.dto.PlayerDto;
import com.hexaware.test.entity.Player;
import com.hexaware.test.repository.PlayerRepository;

import jakarta.transaction.Transactional;

@Service
public class PlayerServiceImp implements IPlayerService {

	@Autowired
	PlayerRepository playerrepo;
	
	@Override
	public Player addPlayer(PlayerDto playerdto) {
		
		Player player = new Player();
		player.setPlayerName(playerdto.getPlayerName());
		player.setJerseyNumber(playerdto.getJerseyNumber());
		player.setRole(playerdto.getRole());
		player.setTotalMatches(playerdto.getTotalMatches());
		player.setTeamName(playerdto.getTeamName());
		player.setCountryName(playerdto.getCountryName());
		
		return playerrepo.save(player);
	}

	@Override
	public Player updatePlayer(PlayerDto playerdto) {
		
		Player player = new Player();
		player.setPlayerId(playerdto.getPlayerId());
		player.setPlayerName(playerdto.getPlayerName());
		player.setJerseyNumber(playerdto.getJerseyNumber());
		player.setRole(playerdto.getRole());
		player.setTotalMatches(playerdto.getTotalMatches());
		player.setTeamName(playerdto.getTeamName());
		player.setCountryName(playerdto.getCountryName());
		
		return playerrepo.save(player);
	}

	@Override
	public void deletePlayerById(int id) {
		
		playerrepo.deleteById(id);
		
	}

	@Override
	public List<Player> getAllPlayer() {
		
		return playerrepo.findAll();
	}

	@Override
	public Player getPlayerById(int id) {
		
		return playerrepo.findById(id).orElse(new Player());
	}

	@Override
	@Transactional
	public void deletePlayerByRole(String playerName,String teamName){
		
		playerrepo.deletePlayerByRole(playerName,teamName);
	}
	
	

}
