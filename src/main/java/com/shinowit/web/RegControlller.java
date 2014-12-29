package com.shinowit.web;

import com.shinowit.dao.mapper.MemberinfoMapper;
import com.shinowit.entity.Memberinfo;
import com.shinowit.tools.Email;
import com.shinowit.tools.MD5;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

/**
 * Created by Administrator on 2014/12/25.
 */
@Controller
@RequestMapping("/")
public class RegControlller {
    @Resource
    private Email mail;
    @Resource
    private MemberinfoMapper memberinfoMapper;

    @RequestMapping("regist")
    public String reg(@ModelAttribute("mer") Memberinfo memberinfo) {
        return "reg";
    }

    @RequestMapping("register")
    public ModelAndView register(@Valid @ModelAttribute("mer") Memberinfo memberinfo, BindingResult bindingResult, HttpServletRequest request, Model model) {
        ModelAndView result = new ModelAndView();
        model.addAttribute(memberinfo);
        String validCode = request.getParameter("Validate_Code");
        String realValid = (String) request.getSession(true).getAttribute("rand");
        if (bindingResult.hasErrors()) {
            result.setViewName("/reg");
            return result;
        }
        if (validCode.equals(realValid)) {
            String regPassword = request.getParameter("RexPassWord");
            if (regPassword.equals(memberinfo.getPassword())) {
                String id = UUID.randomUUID().toString();

                memberinfo.setMemberid(id);
                memberinfo.setRegistdate(new Date());
                BigDecimal balance = new BigDecimal(0);
                memberinfo.setBalance(balance);
                memberinfo.setStatus(false);
                memberinfo.setRemark(id);
                try {
                    memberinfoMapper.insert(memberinfo);
                    String valid_url = "http://localhost:8080/userValid?username=" + memberinfo.getName() + "&remark=" + memberinfo.getMemberid();
                    MD5 md5 = new MD5();
                    String pass = md5.GetMD5Code(memberinfo.getPassword());
                    memberinfo.setPassword(pass);
                    mail.sendMail("用户激活", valid_url, memberinfo.getEmail());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("成功!");
                result.setViewName("login");
                return result;
            } else {
                model.addAttribute("msg", "你两次输入的密码不正确请检查");
                result.setViewName("/reg");
                return result;
            }
        } else {
            model.addAttribute("msgvalide", "您的验证码不正确请检查");
            result.setViewName("/reg");
            return result;
        }
    }

    @RequestMapping("userValid")
    public String valid(@RequestParam("username") String membername, @RequestParam("remark") String memberid, Model model) {
        Memberinfo mer = memberinfoMapper.selectByPrimaryKey(memberid);
        if (mer.getName().equals(membername)) {
            mer.setStatus(true);
            memberinfoMapper.updateByPrimaryKey(mer);
            model.addAttribute("msg", "激活成功！");
            return "login";
        } else {
            model.addAttribute("msg", "激活失败，请重新激活");
            return "login";
        }
    }
}
