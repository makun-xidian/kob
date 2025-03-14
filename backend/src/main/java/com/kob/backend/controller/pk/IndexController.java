package com.kob.backend.controller.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/pk")
public class IndexController {
    @RequestMapping("/index")
    public Map<String, String> index(){
        Map<String, String> map = new HashMap<>();
        map.put("name", "makun");
        map.put("rating", "8080");
        return map;
    }
}
