package com.jjang051.replyboard.service;

import com.jjang051.replyboard.dao.ReplyBoardDao;
import com.jjang051.replyboard.dto.ReplyBoardDto;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ReplyBoardService {

  @Autowired
  ReplyBoardDao replyBoardDao;

  public ReplyBoardService() {
    log.info("===============ReplyBoardService===========");
  }

  public List<ReplyBoardDto> getAllReplyBoard() {
    return replyBoardDao.getAllReplyBoard();
  }

  public int insertBoard(ReplyBoardDto replyBoardDto) {
    return replyBoardDao.insertBoard(replyBoardDto);
  }

  public int insertReplyBoard(ReplyBoardDto replyBoardDto) {
    return replyBoardDao.insertReplyBoard(replyBoardDto);
  }

  public int getMaxReGroup() {
    return replyBoardDao.getMaxReGroup();
  }

  public ReplyBoardDto getSelectedBoard(int no) {
    return replyBoardDao.getSelectedBoard(no);
  }

  public int deleteReplyBoard(int no) {
    return replyBoardDao.deleteReplyBoard(no);
  }

  public int updateHit(int no) {
    return replyBoardDao.updateHit(no);
  }

  public int modifyBoard(ReplyBoardDto replyBoardDto) {
    return replyBoardDao.modifyBoard(replyBoardDto);
  }
}
