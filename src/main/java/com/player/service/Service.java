package com.player.service;

import java.util.List;

import com.player.entity.Player;

public interface Service {
	
	public Player savePlayer(Player pl); //Tested OK by Test case
	
	public List<Player> saveAllPlayers(List<Player> list); //Tested OK by Test case
	
	public Player getPlayer(Integer id); //Tested OK by Test case
	
	public List<Player> getPlayer(String country,String club);
	
	public List<Player> getAllPlayer(); //Tested OK by Test case
	
	public List<Player> getPlayerByJerseyNumber(Integer jerseyNum);
	
	public Player updatePlayer(Integer id,Player player);
	
	public void deleteById(Integer id);
	


}
