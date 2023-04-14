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

import del.ac.id.Microservices.model.Menu;
import del.ac.id.Microservices.service.MenuService;

@RestController
@RequestMapping("/menu")
public class MenuController {
	@Autowired
	MenuService menuService;
	@GetMapping("")
	
	public List<Menu> list() {
		return menuService.listAllMenu();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Menu> get(@PathVariable Integer id) {
		try {
			Menu menu = menuService.getMenu(id);
			return new ResponseEntity<Menu>(menu, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Menu>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add(@RequestBody Menu menu) {
		menuService.saveMenu(menu);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody Menu menu, @PathVariable Integer id) {
		try {
			Menu existHistory = menuService.getMenu(id);
			menu.setId(id); 
			menuService.saveMenu(menu);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		menuService.deleteMenu(id);
	}
}
