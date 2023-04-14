package del.ac.id.Microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import del.ac.id.Microservices.model.History;

public interface HistoryRepository extends JpaRepository<History, Integer> {
	
}
