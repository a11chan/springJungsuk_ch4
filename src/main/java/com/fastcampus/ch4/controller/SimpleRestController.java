package com.fastcampus.ch4.controller;

import com.fastcampus.ch4.domain.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller // -> 반환 타입이 view페이지일 때
//@RestController -> 반환 타입이 변수일 때
public class SimpleRestController {
//  @GetMapping("/ajax")
//  public String ajax() {
//    return "ajax";
//  }

    @GetMapping("/test")
    public String test() {
    return "test";
  }

  @PostMapping("/send")
  //@ResponseBody
  public Person test(@RequestBody Person p) {
    System.out.println("p = " + p);
    p.setName("ABC");
    p.setAge(p.getAge() + 10);

    return p;
  }
}
