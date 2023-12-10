package com.hexaware.test.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class PlayerDto {
	
	private int playerId;
	@NotBlank(message = "PlayerName is required")
	private String playerName;
	@Min(value=0,message = "JerseyNumber should be a non-negative value")
	private int jerseyNumber;
	@NotBlank(message = "Role is required")
	private String role;
	@Min(value=0,message = "TotalMatches should be a non-negative value")
	private int totalMatches;
	@NotBlank(message = "TotalMatches played is required")
	private String teamName;
	@NotBlank(message = "Country Name is required")
	private String countryName;
	
	public PlayerDto() {
		super();
	}

	public PlayerDto(int playerId, String playerName, int jerseyNumber, String role, int totalMatches, String teamName,
			String countryName) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.jerseyNumber = jerseyNumber;
		this.role = role;
		this.totalMatches = totalMatches;
		this.teamName = teamName;
		this.countryName = countryName;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getTotalMatches() {
		return totalMatches;
	}

	public void setTotalMatches(int totalMatches) {
		this.totalMatches = totalMatches;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	
}
