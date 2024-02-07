package com.hexaware.cricketteammanagement.controller;

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

import com.hexaware.cricketteammanagement.dto.PlayerDto;
import com.hexaware.cricketteammanagement.entity.Player;
import com.hexaware.cricketteammanagement.exception.InvalidRoleException;
import com.hexaware.cricketteammanagement.exception.PlayerCreationException;
import com.hexaware.cricketteammanagement.exception.PlayerNotFoundException;
import com.hexaware.cricketteammanagement.service.IPlayerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/players")
public class PlayerRestController {

	@Autowired
	IPlayerService playerService;
	
	@GetMapping("/getall")
	public List<Player> getAllPlayersInDb(){
		return playerService.getAllPlayers();
	}
	
	@GetMapping("/getbyid/{playerId}")
	public Player getPlayerById(@PathVariable @Valid long playerId ) throws PlayerNotFoundException{
		Player player = playerService.getPlayerById(playerId);
		if(player==null)
			throw new PlayerNotFoundException("No player found with the specified player Id");
		
		return player;
	}
	
	@GetMapping("/getbyrole/{role}")
	public List<Player> getByRole(@PathVariable String role) throws InvalidRoleException{
		List<Player> result = playerService.getByRole(role); 
		if(result==null) {
			throw new InvalidRoleException("Invalid role entered");
		}
			
		return result;
	}
	
	@PostMapping("/create")
	public String addNewPlayer(@RequestBody @Valid Player player ) throws PlayerCreationException {
		if(playerService.addNewPlayer(player)==null) {
			throw new PlayerCreationException("Player could not be created");
		}
		return "New Player Record Created";
	}
	
	@PutMapping("/update/{playerId}")
	public String updateExistingPlayer(@PathVariable @Valid long playerId, @RequestBody PlayerDto playerDto) throws PlayerCreationException {
		if(playerService.updateExistingPlayer(playerId,playerDto)==null) {
			throw new PlayerCreationException("Player could not be updated");
		}
		return "Player Record Updated!";
	}
	
	@DeleteMapping("/delete/{playerId}")
	public String deletePlayerFromDb(@PathVariable @Valid long playerId) throws PlayerNotFoundException {
		if(playerService.deletePlayerFromDb(playerId)==null) {
			throw new PlayerNotFoundException("No player record found with specified id");
		}
		return "Player Record Deleted";
	}
}
