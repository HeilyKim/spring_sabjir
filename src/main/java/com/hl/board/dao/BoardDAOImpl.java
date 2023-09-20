package com.hl.board.dao;


import com.hl.board.dto.BoardDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDAOImpl implements BoardDAO{
    @Autowired
    SqlSession sqlSession;

    @Override
    public List<BoardDTO> list() {
        return sqlSession.selectList("board.list");
    }
}
