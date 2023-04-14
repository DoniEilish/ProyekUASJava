package del.ac.id.Microservices.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import del.ac.id.Microservices.model.Menu;
import del.ac.id.Microservices.repository.MenuRepository;


@Service
@Transactional
public class MenuService {
	@Autowired
	private MenuRepository menuRepository;
	
	public List<Menu> listAllMenu() {
		return menuRepository.findAll();
	}
	
	public void saveMenu(Menu menu) {
		menuRepository.save(menu);
	}
	
	public Menu getMenu(Integer id) {
		return menuRepository.findById(id).get();
	}
	
	public void deleteMenu(Integer id) {
		menuRepository.deleteById(id);
	}
}
