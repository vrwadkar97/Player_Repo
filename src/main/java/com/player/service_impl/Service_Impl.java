package com.player.service_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.player.dao.Repository;
import com.player.entity.Player;

@Service
public class Service_Impl implements com.player.service.Service{
	
	@Autowired
	private Repository repository;

	//To save a single Player data
	@Override
	public Player savePlayer(Player player) {
		Player player2=repository.save(player);
		return player2;
	}

	//To save multiple Player data
	@Override
	public List<Player> saveAllPlayers(List<Player> list) {
		List<Player> list2 =(List) repository.saveAll(list);
		return list2;
	}

	//To get Single Player data 
	@Override
	public Player getPlayer(Integer id) {
		Player player=repository.findByPlayerId(id);
		return player;
	}

	//To get Player data based on country & club as filter
	@Override
	public List<Player> getPlayer(String country,String club) {
		List<Player> list=(List)repository.getList(country, club);
		return list;
	}

	//To get all player data
	@Override
	public List<Player> getAllPlayer() {
		List<Player> list =(List)repository.findAll();
		return list;
	}
	
	//To get Player data as per Jersey Number
	@Override
	public List<Player> getPlayerByJerseyNumber(Integer jerseyNum){
		List<Player> list=repository.findByJerseyNum(jerseyNum);
		return list;
	}

	//To update the Player data
	@Override
	public Player updatePlayer(Integer id,Player player) {
		Player player2=repository.findById(id).get();
		if(player.getFirstName()!=null) {
			player2.setFirstName(player.getFirstName());
		}
		if(player.getLastName()!=null) {
			player2.setLastName(player.getLastName());
		}
		if(player.getJerseyNum()!=null) {
			player2.setJerseyNum(player.getJerseyNum());
		}
		if(player.getClubName()!=null) {
			player2.setClubName(player.getClubName());
		}
		if(player.getCountryName()!=null) {
			player2.setCountryName(player.getCountryName());
		}
		if(player.getMobNum()!=null) {
			player2.setMobNum(player.getMobNum());
		}
		
		return repository.save(player2);
	}

	//To delete the player data using ID using CRUD repository default method.
	@Override
	public void deleteById(Integer id) {
		repository.deleteById(id);
		
	}

	
	
	

}
