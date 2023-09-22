package com.hl.board.dao;

import com.hl.board.dto.ReplyDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReplyDAO {
@Autowired
    SqlSession sqlSession;

    public void save(ReplyDTO replyDTO) {
        sqlSession.insert("reply.insert",replyDTO);
    }
}
