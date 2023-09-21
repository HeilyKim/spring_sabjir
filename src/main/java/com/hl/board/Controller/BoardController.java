package com.hl.board.Controller;

import com.hl.board.Service.BoardService;
import com.hl.board.dto.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    @GetMapping("detail")
    public String detail(Model model, @RequestParam(value = "id")int id){
        BoardDTO detail = boardService.detail(id);
        model.addAttribute("detail",detail);
        return "board/detail";
    }
    @GetMapping("delete")
    public String delete(@RequestParam(value = "id") int id){
        boardService.delete(id);
        return "redirect:list";
    }
    @GetMapping("write")
    public String write(){
        return "board/write";
    }
    @PostMapping("insert")
    public String insert(BoardDTO boardDTO){
        boardService.insert(boardDTO);
        int id = boardDTO.getId();
        return "redirect:detail?id="+id;
    }
}
