package com.shinowit.web;

import com.shinowit.entity.Memberinfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2014/12/25.
 */
@Controller
@RequestMapping("/")
public class RegControlller {
    @RequestMapping("reg")
    public String reg(@ModelAttribute("mer") Memberinfo mer){
        return "reg";
    }
    @RequestMapping("register")
    public String register(){
        return "1111";
    }

}
