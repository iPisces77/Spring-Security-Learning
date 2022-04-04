package com.example.spring.security.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author iPisces42
 * @version 1.0
 * @className HelloController
 * @description TODO
 * @date 2022年04月05日 1:27
 */
@RestController
public class HelloController {
  @GetMapping("/hello")
  public String hello() {
    return "hello";
  }
}
