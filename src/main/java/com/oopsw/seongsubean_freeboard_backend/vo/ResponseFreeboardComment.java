package com.oopsw.seongsubean_freeboard_backend.vo;

import lombok.Data;

@Data
public class ResponseFreeboardComment {
  private String id;

  private String email;
  private String writer;

  private String content;
}
