package com.oopsw.seongsubean_freeboard_backend.vo;

import lombok.Data;

@Data
public class RequestFreeboard {
  private String email;
  private String writer; //통신 생각하는 기준...의사결정하는게
  //너무 어려워요...ㄷㄷ => 전체적인 성능문제로 이어지지 않느냐
  //변수명 굳이 통일 시킨 이유는 정책의 문제긴 하지만...
  //접점은 한개만(email)해도 되니까...없지...db모델링 먼저한것도 아닌데...ㄷㄷ

  private String title;
  private String content;
  private String headWord;
  private String images;

}
