package com.jjang051.ch04.dto;

public class BoardDto {

  private int no;
  private String userName;
  private String subject;
  private String contents;
  private String regDate;
  private int hit;

  public BoardDto(
    int no,
    String userName,
    String subject,
    String contents,
    String regDate,
    int hit
  ) {
    this.no = no;
    this.userName = userName;
    this.subject = subject;
    this.contents = contents;
    this.regDate = regDate;
    this.hit = hit;
  }

  public BoardDto() {}

  public int getNo() {
    return this.no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public String getUserName() {
    return this.userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getSubject() {
    return this.subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getContents() {
    return this.contents;
  }

  public void setContents(String contents) {
    this.contents = contents;
  }

  public String getRegDate() {
    return this.regDate;
  }

  public void setRegDate(String regDate) {
    this.regDate = regDate;
  }

  public int getHit() {
    return this.hit;
  }

  public void setHit(int hit) {
    this.hit = hit;
  }
}
