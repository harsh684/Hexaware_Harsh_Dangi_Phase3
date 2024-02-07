package com.hexaware.cricketteammanagement.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class PlayerDto {

	private long playerId;
	
	private String playerName;
	
	private int jerseyNumber;

	private String role;
	
	private int totalMatches;
	
	private String teamName;
	
	private String countryName;

	private String description;

	public PlayerDto() {
		super();
	}

	public PlayerDto(long playerId, @NotBlank String playerName, @Min(1) int jerseyNumber, @NotBlank String role,
			int totalMatches, @NotBlank String teamName, @NotBlank String countryName, String description) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.jerseyNumber = jerseyNumber;
		this.role = role;
		this.totalMatches = totalMatches;
		this.teamName = teamName;
		this.countryName = countryName;
		this.description = description;
	}

	public long getPlayerId() {
		return playerId;
	}

	public void setPlayerId(long playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getjerseyNumber() {
		return jerseyNumber;
	}

	public void setjerseyNumber(int jerseyNumber) {
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", jerseyNumber=" + jerseyNumber + ", role="
				+ role + ", totalMatches=" + totalMatches + ", teamName=" + teamName + ", countryName=" + countryName
				+ ", description=" + description + "]";
	}
	
}
