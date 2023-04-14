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

import del.ac.id.Microservices.model.TempatDuduk;
import del.ac.id.Microservices.service.TempatDudukService;

@RestController
@RequestMapping("/tempat_duduk")
public class TempatDudukController {
	@Autowired
	TempatDudukService tempatdudukService;
	@GetMapping("")
	
	public List<TempatDuduk> list() {
		return tempatdudukService.listAllTempatDuduk();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<TempatDuduk> get(@PathVariable Integer id) {
		try {
			TempatDuduk pulsa = tempatdudukService.getTempatDuduk(id);
			return new ResponseEntity<TempatDuduk>(pulsa, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<TempatDuduk>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add(@RequestBody TempatDuduk pulsa) {
		tempatdudukService.saveTempatDuduk(pulsa);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody TempatDuduk tempatduduk, @PathVariable Integer id) {
		try {
			TempatDuduk existTempatDuduk = tempatdudukService.getTempatDuduk(id);
			tempatduduk.setId(id); 
			tempatdudukService.saveTempatDuduk(tempatduduk);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		tempatdudukService.deleteTempatDuduk(id);
	}
}
