package com.jjang051.ch04.dao;

import com.jjang051.ch04.dto.BoardDto;
import java.util.ArrayList;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardDao {
  // xml에서 설정한 id명 = 함수명
  // Dao에서 함수 선언만 하고 Service에서 구체적인 내용 작성
  ArrayList<BoardDto> getAllBoard();
}
