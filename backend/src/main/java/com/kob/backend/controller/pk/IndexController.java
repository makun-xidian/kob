package com.kob.backend.controller.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/pk")
@RestController
public class IndexController {
    @RequestMapping("/index")
    public String index(){
        return "pk/index.html";
    }
}
