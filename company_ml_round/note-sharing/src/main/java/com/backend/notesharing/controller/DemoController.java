package com.backend.notesharing.controller;

import com.backend.notesharing.util.GenericResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo-1")
public class DemoController {

    @GetMapping("/name")
    public ResponseEntity<GenericResponse<Integer>> getName() {
        return ResponseEntity.ok(GenericResponse.success(12));
    }

//    @GetMapping("/name1")
//    public GenericResponse<String> getName1() {
//        return GenericResponse.success("String");
//    }
}
