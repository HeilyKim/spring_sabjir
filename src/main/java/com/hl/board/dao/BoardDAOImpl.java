package com.hl.board.dao;


import com.hl.board.dto.BoardDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDAOImpl implements BoardDAO {
    @Autowired
    SqlSession sqlSession;

    @Override
    public List<BoardDTO> list() {
        return sqlSession.selectList("board.list");
    }

    @Override
    public BoardDTO detail(int id) {
        return sqlSession.selectOne("board.detail", id);
    }

    @Override
    public void delete(int id) {
        sqlSession.delete("board.delete", id);
    }

    @Override
    public void insert(BoardDTO boardDTO) {
        sqlSession.insert("board.insert",boardDTO);
    }
}
