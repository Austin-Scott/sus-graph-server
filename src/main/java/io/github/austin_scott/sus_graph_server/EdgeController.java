package io.github.austin_scott.sus_graph_server;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EdgeController {
	
	@PostMapping("/edge")
	public void createEdge(
			@RequestParam(value = "gameID") int gameID, 
			@RequestParam(value = "sourceColorID") String sourceColorID,
			@RequestParam(value = "targetColorID") String targetColorID) {
		
		// TODO create edge
		
	}

	@DeleteMapping("/edge")
	public void deleteEdge(
			@RequestParam(value = "gameID") int gameID, 
			@RequestParam(value = "sourceColorID") String sourceColorID,
			@RequestParam(value = "targetColorID") String targetColorID) {
		
		// TODO delete edge
		
	}
	
	@PatchMapping("/edge")
	public void updateEdge(
			@RequestParam(value = "gameID") int gameID, 
			@RequestParam(value = "sourceColorID") String sourceColorID,
			@RequestParam(value = "targetColorID") String targetColorID,
			@RequestParam(value = "sus") Boolean sus,
			@RequestParam(value = "susLevel") int susLevel,
			@RequestParam(value = "reason") String reason) {
		
		// TODO update edge
		
	}
	
	
}
