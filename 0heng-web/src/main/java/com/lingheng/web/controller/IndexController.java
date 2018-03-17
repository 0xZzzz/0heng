package com.lingheng.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by 0xZzzz
 */
@Controller
public class IndexController {

    @GetMapping("/index")
    public String index() {
        return "/index.html";
    }

}
