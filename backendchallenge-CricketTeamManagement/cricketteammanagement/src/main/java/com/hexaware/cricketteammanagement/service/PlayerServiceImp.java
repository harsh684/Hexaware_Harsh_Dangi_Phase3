package com.hexaware.cricketteammanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.cricketteammanagement.dto.PlayerDto;
import com.hexaware.cricketteammanagement.entity.Player;
import com.hexaware.cricketteammanagement.exception.InvalidRoleException;
import com.hexaware.cricketteammanagement.repository.PlayerRepository;

@Service
public class PlayerServiceImp implements IPlayerService {

	@Autowired
	PlayerRepository playerRepository;
	
	@Override
	public List<Player> getAllPlayers() {
		
		return playerRepository.findAll();
	}

	@Override
	public Player getPlayerById(long playerId) {
		return playerRepository.findById(playerId).orElse(null);
	}

	@Override
	public Player addNewPlayer(Player player) {
//		Player player  = new Player();
//		player.setPlayerName(playerDto.getPlayerName());
//		player.setjerseyNumber(playerDto.getjerseyNumber());
//		player.setRole(playerDto.getRole());
//		player.setTotalMatches(playerDto.getTotalMatches());
//		player.setTeamName(playerDto.getTeamName());
//		player.setCountryName(playerDto.getCountryName());
//		player.setDescription(playerDto.getDescription());
//		
		return playerRepository.save(player);
	}

	@Override
	public Player updateExistingPlayer(long playerId, PlayerDto playerDto) {

		Player player  = new Player();
		player.setPlayerId(playerId);
		player.setPlayerName(playerDto.getPlayerName());
		player.setjerseyNumber(playerDto.getjerseyNumber());
		player.setRole(playerDto.getRole());
		player.setTotalMatches(playerDto.getTotalMatches());
		player.setTeamName(playerDto.getTeamName());
		player.setCountryName(playerDto.getCountryName());
		player.setDescription(playerDto.getDescription());
		
		return playerRepository.save(player);
		
	}

	@Override
	public String deletePlayerFromDb(long playerId) {
		Player player = playerRepository.findById(playerId).orElse(null);
		if(player==null)
			return null;
		
		playerRepository.delete(player);
		return "Player deleted from the database";
	}

	@Override
	public List<Player> getByRole(String role) {
		
		if(!(role.equalsIgnoreCase("Batsman")||role.equalsIgnoreCase("Bowler")||role.equalsIgnoreCase("All Rounder")||role.equalsIgnoreCase("Keeper"))) {
			return null;
		}else {
			return playerRepository.getByRole(role);
		}
	}

}
