package com.shinowit.web;

import com.shinowit.dao.mapper.MemberinfoMapper;
import com.shinowit.entity.Memberinfo;
import com.shinowit.tools.MD5;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2014/12/25.
 */
@Controller
@RequestMapping("/")
public class LoginController {
    @Resource
    private MemberinfoMapper mapper;

    @RequestMapping("login")
    public String login() {
        return "login";
    }

    @RequestMapping("Login")
    public String loginL(Model model, HttpServletRequest request) {
        String uername = request.getParameter("UserName");
        String passwrod = request.getParameter("PassWord");
        MD5 md5 = new MD5();
        String pass = md5.GetMD5Code(passwrod);
        passwrod = pass;
        Memberinfo mer = new Memberinfo();
        try {
            mer = mapper.selectMemberinfo(uername, passwrod);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (mer != null) {
            if (mer.getStatus()) {
                model.addAttribute("msg", "登陆成功！");
                return "index";
            } else {
                model.addAttribute("msg", "用户尚未激活，请先激活后再登录");
                return "login";
            }
        } else {
            model.addAttribute("msg", "用户名或密码不正确，请重新输入");
            return "login";
        }
    }
}
