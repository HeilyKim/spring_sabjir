package com.hl.board.Controller;

import com.hl.board.Service.BoardService;
import com.hl.board.dto.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {
    @Autowired
    private BoardService boardService;
    @GetMapping("list")
    public String board(Model model) {
        List<BoardDTO> list = boardService.list();
        model.addAttribute("list",list);
        return "board/boardList";
    }
}
