package com.hexaware.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.test.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
	
	
	@Modifying
	@Query("Delete from Player p where p.playerName = ?1 and p.teamName = ?2")
	public void deletePlayerByRole(String playerName,String teamName);
	
	

}
