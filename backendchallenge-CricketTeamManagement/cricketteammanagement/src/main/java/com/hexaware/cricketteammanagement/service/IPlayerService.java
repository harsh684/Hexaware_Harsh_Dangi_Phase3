package com.hexaware.cricketteammanagement.service;

import java.util.List;

import com.hexaware.cricketteammanagement.dto.PlayerDto;
import com.hexaware.cricketteammanagement.entity.Player;

public interface IPlayerService {

	public List<Player> getAllPlayers();
	
	public Player getPlayerById(long playerId);
	
	public Player addNewPlayer(Player player);
	
	public Player updateExistingPlayer(long playerId, PlayerDto playerDto);
	
	public String deletePlayerFromDb(long playerId);

	public List<Player> getByRole(String role);
}
