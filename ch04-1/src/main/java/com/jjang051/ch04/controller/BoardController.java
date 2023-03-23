package com.jjang051.ch04.controller;

import com.jjang051.ch04.dto.*;
import com.jjang051.ch04.service.BoardService;
import java.util.ArrayList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/board")
public class BoardController {

  @Autowired
  BoardService boardService;

  @GetMapping("/list")
  public String list(Model model) {
    ArrayList<BoardDto> boardList = boardService.getAllBoard();
    log.info("boardList : {}", boardList);
    model.addAttribute("boardList", boardList);
    return "redirect:/board/list";
  }
}
