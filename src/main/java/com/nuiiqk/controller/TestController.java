package com.nuiiqk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/t")
public class TestController {

  /**
   * 测试
   * @return
   */
  @GetMapping("/t")
  public String test() {
    return "OK";
  }

}
