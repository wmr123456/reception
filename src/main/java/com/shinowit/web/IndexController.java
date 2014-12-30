package com.shinowit.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2014/12/25.
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @RequestMapping("")
    public void selectMemCla(Model model) {

        model.addAttribute("", "");
    }
}
