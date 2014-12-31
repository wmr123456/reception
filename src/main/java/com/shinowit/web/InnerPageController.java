package com.shinowit.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2014/12/25.
 */
@Controller
@RequestMapping("/")
public class InnerPageController {
    @RequestMapping("inner-page")
    public String innerPage() {
        return "inner-page";
    }
}
