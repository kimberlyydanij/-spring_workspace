package service;

import java.util.List;

import dao.BoardDAO;
import dto.BoardDTO;
import dto.PageDTO;

public class BoardServiceImp implements BoardService{
	
	private BoardDAO dao;
	
	
	public BoardServiceImp() {
	
	}
	
	public void setDao(BoardDAO dao) {
		this.dao = dao;
	}

	@Override
	public int countProcess() {
		return 0;
	}

	@Override
	public List<BoardDTO> listProcess(PageDTO pv) {
		return null;
	}

	@Override
	public void insertProcess(BoardDTO dto) {
	}

	@Override
	public BoardDTO contentProcess(int num) {
		return null;
	}

	@Override
	public void reStepProcess(BoardDTO dto) {
	}

	@Override
	public BoardDTO updateSelectProcess(int num) {
		return null;
	}

	@Override
	public void updateProcess(BoardDTO dto, String urlpath) {
	}

	@Override
	public void deleteProcess(int num, String urlpath) {
	}

	@Override
	public String fileSelectprocess(int num) {
		return null;
	}

	
} // end class

