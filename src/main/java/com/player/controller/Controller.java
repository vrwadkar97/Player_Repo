package com.player.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.player.entity.Player;
import com.player.service.Service;

@RestController
@RequestMapping("/player")
public class Controller {

	private static final Logger logger=LoggerFactory.getLogger(Controller.class);
	





	@Autowired
	private Service service;

	// OK
	@PostMapping("/save")
	public ResponseEntity<Player> savePlayer(@RequestBody Player player) {
		logger.info("Inside Controller class :Calling from SavePlayer() method");
		Player player2 = service.savePlayer(player);
        logger.info("Called the serviceImpl's savePlayer() method which returns Player>>"+player2);
		return ResponseEntity.ok().body(player2); 
	}

	// OK
	@PostMapping("/saveAll")
	public ResponseEntity<List<Player>> saveAllPlayer(@RequestBody List<Player> list) {
		List<Player> list2 = service.saveAllPlayers(list);
		return ResponseEntity.ok().body(list2);
	}

	// OK
	@GetMapping("/get/{id}")
	public ResponseEntity<Player> getPlayer(@PathVariable Integer id) {
		Player player = service.getPlayer(id);
		return ResponseEntity.ok().body(player);
	}

	// OK
	@GetMapping("/getcustom/{country}/{club}")
	public ResponseEntity<List<Player>> getPlayerByCustom(@PathVariable String country, @PathVariable String club) {
		List<Player> list = service.getPlayer(country, club);
		return ResponseEntity.ok().body(list);

	}

	// OK
	@GetMapping("/getAll")
	public List<Player> getAllPlayer() {
		List<Player> list = service.getAllPlayer();
		return list;
	}

	// OK
	@GetMapping("/getplayerjn/{jerseyNum}")
	public ResponseEntity<List<Player>> getPlayerByJerseyNum(@PathVariable Integer jerseyNum) {
		List<Player> list = service.getPlayerByJerseyNumber(jerseyNum);
		return ResponseEntity.ok().body(list);
	}

	// OK
	@PutMapping("/update/{id}")
	public ResponseEntity<Player> updatePlayer(@PathVariable Integer id, @RequestBody Player player) {
		Player player2 = service.updatePlayer(id, player);
		return ResponseEntity.ok().body(player2);
	}

	// OK
	@DeleteMapping("/delete/{id}")
	public String deletePlayer(@PathVariable Integer id) {
		service.deleteById(id);
		return "successfully deleted player with id>>" + id;
	}

}
