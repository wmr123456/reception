package com.shinowit.web;

import com.shinowit.entity.Memberinfo;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * Created by Administrator on 2014/12/25.
 */
@Controller
@RequestMapping("/")
public class RegControlller {
    @RequestMapping("reg")
    public String reg(@ModelAttribute("mer") Memberinfo memberinfo) {
        return "reg";
    }
    @RequestMapping("register")
    public String register(@Valid @ModelAttribute("mer") Memberinfo memberinfo, BindingResult bindingResult, RedirectAttributes redirectAttributes, HttpServletRequest request) {
        if (bindingResult.hasErrors()) {
            return "reg";
        }
//        Pattern p = Pattern.compile("\\w+@(\\w+.)+[a-z]{2,3}");判断邮箱格式是否正确
//        Matcher m = p.matcher(memberinfo.getEmail());
//        boolean isEmail = m.matches();
//        if(isEmail){
//
//        }
        String regPassword = request.getParameter("RexPassWord");
        if (regPassword.equals(memberinfo.getPassword())) {
            System.out.println("成功！");
        }
        return "1111";
    }

}
