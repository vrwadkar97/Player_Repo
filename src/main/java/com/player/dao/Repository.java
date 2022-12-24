package com.player.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.player.entity.Player;

public interface Repository extends CrudRepository<Player, Integer> {
	
public Player findByPlayerId(Integer playerId);

@Query(value="select * from player where country_name=?1 AND club_name=?2",nativeQuery = true)
public List<Player> getList(String country,String club);

public List<Player> findByJerseyNum(Integer jerseyNum);

@Query(value="delete from player where player_id=?1",nativeQuery = true)
public Player deletePlayer(Integer id);
}
