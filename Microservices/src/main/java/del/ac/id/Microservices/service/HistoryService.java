package del.ac.id.Microservices.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import del.ac.id.Microservices.model.History;
import del.ac.id.Microservices.repository.HistoryRepository;

@Service
@Transactional
public class HistoryService {
	@Autowired
	private HistoryRepository historyRepository;
	
	public List<History> listAllHistory() {
		return historyRepository.findAll();
	}
	
	public void saveHistory(History history) {
		historyRepository.save(history);
	}
	
	public History getHistory(Integer id) {
		return historyRepository.findById(id).get();
	}
	
	public void deleteHistory(Integer id) {
		historyRepository.deleteById(id);
	}
}
