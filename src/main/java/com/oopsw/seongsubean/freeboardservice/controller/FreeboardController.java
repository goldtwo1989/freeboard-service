package com.oopsw.seongsubean.freeboardservice.controller;

import com.oopsw.seongsubean.freeboardservice.vo.ResponseFreeboardDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/freeboard")
public class FreeboardController {
    @GetMapping("/get")
    public ResponseEntity<List<ResponseFreeboardDto>> get(){
        return null;
    }
}
