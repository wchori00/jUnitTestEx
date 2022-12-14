package tommy.spring.persistence;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import tommy.spring.domain.Board;

public interface BoardRepository extends CrudRepository<Board, Long> {
	List<Board> findByTitle(String searchKeyword);
	List<Board> findByContentContaining(String searchKeyword);
}