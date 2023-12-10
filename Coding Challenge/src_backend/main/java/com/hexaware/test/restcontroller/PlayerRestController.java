package com.hexaware.test.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.test.dto.PlayerDto;
import com.hexaware.test.entity.Player;
import com.hexaware.test.service.IPlayerService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/cricket")
public class PlayerRestController {
	
	@Autowired
	IPlayerService playerservice;
	
	@PostMapping("/addplayer")
	public Player addPlayer(@RequestBody PlayerDto playerdto) {
		
		return playerservice.addPlayer(playerdto);
	}

	@PutMapping("/updateplayer")
	public Player updatePlayer(@RequestBody PlayerDto playerdto) {
		
		return playerservice.updatePlayer(playerdto);
	}
	
	@DeleteMapping("/deleteplayer")
	public String deleteById(@PathVariable int playerid) {
		
		playerservice.deletePlayerById(playerid);
		 return "Deleted";
	}
	
	@GetMapping("/getall")
	public List<Player> getAll(){
		
		return playerservice.getAllPlayer();
	}
	
	@GetMapping("/getbyid")
	public Player getById(@PathVariable int playerid){
		
		return playerservice.getPlayerById(playerid);
	}
	
	@DeleteMapping("/deletebyrole/{playerName}/{teamName}")
	public String deleteByRole(@PathVariable String playerName,@PathVariable String teamName) {
		
		playerservice.deletePlayerByRole(playerName,teamName);
		 return "Deleted";
	}
	
	
	
	
}
