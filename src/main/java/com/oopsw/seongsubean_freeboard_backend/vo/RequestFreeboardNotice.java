package com.oopsw.seongsubean_freeboard_backend.vo;

import lombok.Data;

@Data
public class RequestFreeboardNotice {
  private String title;
  private String content;
  private String images; //db를 따로 쓰면 안됨
  private String writer; //어쨋든 관리자
  //private String headWord; //공지사항 머릿말 자유::리뷰 자유::수다
  // 자유::공지
  //폼을 똑같이 보내/ 서비스단에서 권한 확인하고 관리자이면 자유::공지 넣어주자
  //관리자도 일반 사용자랑 같은 폼을 사용한다는 걸 자체를 보여줄 이유가 없다....
  //어디서 처리하는게 좋을ㅈ ㅣ생각


}
