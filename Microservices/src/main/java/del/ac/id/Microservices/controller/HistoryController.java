package del.ac.id.Microservices.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import del.ac.id.Microservices.model.History;
import del.ac.id.Microservices.service.HistoryService;

@RestController
@RequestMapping("/history")
public class HistoryController {
	@Autowired
	HistoryService historyService;
	@GetMapping("")
	
	public List<History> list() {
		return historyService.listAllHistory();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<History> get(@PathVariable Integer id) {
		try {
			History history = historyService.getHistory(id);
			return new ResponseEntity<History>(history, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<History>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add(@RequestBody History history) {
		historyService.saveHistory(history);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody History history, @PathVariable Integer id) {
		try {
			History existHistory = historyService.getHistory(id);
			history.setId(id); 
			historyService.saveHistory(history);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		historyService.deleteHistory(id);
	}
}
