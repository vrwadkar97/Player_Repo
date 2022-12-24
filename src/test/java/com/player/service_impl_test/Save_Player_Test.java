package com.player.service_impl_test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.player.dao.Repository;
import com.player.entity.Player;
import com.player.service.Service;
import com.player.service_impl.Service_Impl;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
class Save_Player_Test {

	@Mock // This annotation creates mock object of specified field
	private Repository repository;

	@InjectMocks // This annotation creates mock object of specified field & inject the field
					// with @Mock annotation
	// .i.e inject the mock object.
	private Service_Impl impl;

//	@Test
//	public void savePlayerTest() {
//		Player player=new Player(101, "leo", "messi", 10, "PSG", "Argentina", 445566l);
//		when(repository.save(player)).thenReturn(player);  //Expected Return
//		
//		Player player2=impl.savePlayer(player);  //Actual Return
//		assertEquals(player, player2);
//	}

//	@Test
//	public void saveAllPlayersTest() {
//		Player player=new Player(101, "leo", "messi", 10, "PSG", "Argentina", 445566l);
//		Player player2=new Player(101, "kevin", "de bryune", 17, "CITY", "Belgium", 122221l);
//		
//		List<Player> list=new ArrayList<>(); 
//		list.add(player);
//		list.add(player2);
//		
//		when(repository.saveAll(list)).thenReturn(list);//Expected list
//		
//		List<Player> list2=impl.saveAllPlayers(list); //Actual list
//		assertEquals(list, list2);
//	
//	}

//	@Test
//	public void getPlayerTest() {
//		Player player = new Player(101, "leo", "messi", 10, "PSG", "Argentina", 445566l);
//
//		when(repository.findByPlayerId(101)).thenReturn(player);// Expected
//
//		Player player2 = impl.getPlayer(101); // actual
//
//		assertEquals(player, player2);
//
//	}
	
//	@Test
//	public void getAllPlayerTest() {
//		Player player = new Player(101, "leo", "messi", 10, "PSG", "Argentina", 445566l);
//		Player player2 = new Player(101, "kevin", "de bryune", 17, "CITY", "Belgium", 122221l);
//
//		List<Player> list = new ArrayList<>();
//		list.add(player);
//		list.add(player2);
//
//		when(repository.findAll()).thenReturn(list); // Expected
//
//		List<Player> list2 = impl.getAllPlayer();
//
//		assertEquals(list, list2);
//	}
	
	//Under Test
//	public void deleteByIdTest() {
//		Player player = new Player(101, "leo", "messi", 10, "PSG", "Argentina", 445566l);
//		Player player2=repository.save(player);
//		
//		
//	}

}
