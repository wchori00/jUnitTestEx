package tommy.spring;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tommy.spring.domain.Board;


@SpringBootTest
public class BoardRepository {
	@Autowired
	private tommy.spring.persistence.BoardRepository boardRepo;
	@Test
	public void testDeleteBoard() {
	boardRepo.deleteById(1L);
	}
	
	//	@Test
//	public void testUpdateBoard() {
//	System.out.println("1번 게시글 조회");
//	Board board = boardRepo.findById(1L).get();
//	System.out.println("1번 글 수정");
//	board.setWriter("사오정");
//	boardRepo.save(board);
//	}
//	@Test
//	public void testGetBoard() {
//	Board board = boardRepo.findById(1L).get();
//	System.out.println("---> " + board.toString());
//	}
//	@Test
//	public void testInsertBoard() {
//		Board board = new Board();
//		board.setTitle("첫 번째 글");
//		board.setWriter("손오공");
//		board.setContent("등록 테스트");
//		board.setRegDate(new Date());
//		board.setCnt(0L);
//		boardRepo.save(board);
//	}

}
