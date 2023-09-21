package com.hl.board.Service;

import com.hl.board.dao.BoardDAO;
import com.hl.board.dto.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {
    @Autowired
    BoardDAO boardDAO;

    @Override
    public List<BoardDTO> list() {
        return boardDAO.list();
    }

    @Override
    public BoardDTO detail(int id) {
        return boardDAO.detail(id);
    }

    @Override
    public void delete(int id) {
        boardDAO.delete(id);
    }

    @Override
    public void insert(BoardDTO boardDTO) {
        boardDAO.insert(boardDTO);
    }
}
