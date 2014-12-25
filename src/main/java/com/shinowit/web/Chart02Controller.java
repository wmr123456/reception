package com.shinowit.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2014/12/25.
 */
@Controller
@RequestMapping("/")
public class Chart02Controller {
    @RequestMapping("chart02")
    public String chart02(){
        return "chart02";
    }
}
