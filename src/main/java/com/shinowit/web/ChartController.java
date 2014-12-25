package com.shinowit.web;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2014/12/24.
 */
@Controller
@RequestMapping(value="/")
public class ChartController {

    @RequestMapping("test")
    public String test(Model model){
        return "test";
    }

    @RequestMapping("chart")
    public String test1(){
        return "chart";
    }
}
