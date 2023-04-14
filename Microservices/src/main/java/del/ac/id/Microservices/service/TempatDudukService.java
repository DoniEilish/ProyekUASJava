package del.ac.id.Microservices.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import del.ac.id.Microservices.model.TempatDuduk;
import del.ac.id.Microservices.repository.TempatDudukRepository;

@Service
@Transactional
public class TempatDudukService {
	@Autowired
	private TempatDudukRepository tempatdudukRepository;
	
	public List<TempatDuduk> listAllTempatDuduk() {
		return tempatdudukRepository.findAll();
	}
	
	public void saveTempatDuduk(TempatDuduk tempatduduk) {
		tempatdudukRepository.save(tempatduduk);
	}
	
	public TempatDuduk getTempatDuduk(Integer id) {
		return tempatdudukRepository.findById(id).get();
	}
	
	public void deleteTempatDuduk(Integer id) {
		tempatdudukRepository.deleteById(id);
	}
}
