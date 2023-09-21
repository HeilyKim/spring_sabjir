package com.hl.board.Service;

import com.hl.board.dto.BoardDTO;

import java.util.List;

public interface BoardService {
    public List<BoardDTO> list();

    public BoardDTO detail(int id);

    public void delete(int id);

    public void insert(BoardDTO boardDTO);
}
