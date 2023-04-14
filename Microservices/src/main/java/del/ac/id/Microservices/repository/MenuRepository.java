package del.ac.id.Microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import del.ac.id.Microservices.model.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer> {

}
