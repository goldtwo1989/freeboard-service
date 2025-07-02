package com.oopsw.seongsubean_freeboard_backend.vo;

import lombok.Data;

@Data
public class ResponseFreeboard {
  private String email;
  private String writer;

  private String title;
  //게시글 작성하고 나서 리다이렉트 하는 화면이 게시글 상세화면인데
  //게시글 상세화면에는 댓글도 보이니까 여기에는 댓글 관련 데이터도
  //들어가야 하는거 아닌가 머리 터지겠다 ㅠㅜㅠㅜㅠㅜㅠㅜㅠㅜ

}
