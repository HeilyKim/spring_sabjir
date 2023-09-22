package com.hl.board.Service;

import com.hl.board.dao.ReplyDAO;
import com.hl.board.dto.ReplyDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReplyService {

    @Autowired
    private ReplyDAO replyDAO;

    public void save(ReplyDTO replyDTO) {
        replyDAO.save(replyDTO);
    }
}
