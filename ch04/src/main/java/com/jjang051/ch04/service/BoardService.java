package com.jjang051.ch04.service;

import com.jjang051.ch04.dao.BoardDao;
import com.jjang051.ch04.dto.BoardDto;
import java.util.ArrayList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BoardService {

  // 외부에서 이 객체를 주입받을 것이다 (new 대신 @Autowired)
  // 제어 역전 - DI (Dependency Injection)
  // Dao에서는 함수 선언 + mapper (DB에서 긁어옴, 반환형 결정)와 맞추기까지만 하고
  // 실질적으로 타입을 반환하기까지의 과정은 Service에서 작성함
  // 외부 주입은 싱글턴 패턴 (객체를 하나만 생성해서 그것만 주구장창 씀)

  @Autowired
  BoardDao boardDao;

  public ArrayList<BoardDto> getAllBoard() {
    ArrayList<BoardDto> boardList = boardDao.getAllBoard();
    log.info("boardList :  {}", boardList);
    return boardList;
  }
}
