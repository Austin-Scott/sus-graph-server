package io.github.austin_scott.sus_graph_server;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {
	
	@PostMapping("/player")
	public void createPlayer(
			@RequestParam(value = "gameID") int gameID, 
			@RequestParam(value = "colorID") String colorID) {
		
		// TODO create player
		
	}
	
	@DeleteMapping("/player")
	public void deletePlayer(
			@RequestParam(value = "gameID") int gameID, 
			@RequestParam(value = "colorID") String colorID) {
		
		// TODO delete player
		
	}
	
	@PatchMapping("/player")
	public void updatePlayer(
			@RequestParam(value = "gameID") int gameID, 
			@RequestParam(value = "colorID") String colorID,
			@RequestParam(value = "alive") Boolean alive,
			@RequestParam(value = "role") String role) {
		
		// TODO update player
		
	}
	
	
}
