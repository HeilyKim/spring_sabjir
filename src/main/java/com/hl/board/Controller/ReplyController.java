package com.hl.board.Controller;

import com.hl.board.Service.ReplyService;
import com.hl.board.dto.ReplyDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/reply")
public class ReplyController {
    @Autowired
    private ReplyService replyService;

    @PostMapping("/save")
    public @ResponseBody List<ReplyDTO> save(@ModelAttribute ReplyDTO replyDTO){
        System.out.println("dto"+replyDTO);
        replyService.save(replyDTO);
        return null;
    }
}
