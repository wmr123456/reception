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
 * Created by Administrator on 2014/12/29.
 */
@Controller
@RequestMapping("/")
public class GetPwd3Controller {
    @Resource
    private MemberinfoMapper mapper;

    @RequestMapping("GetPwd3")
    public String getPwd() {
        return "GetPwd3";
    }

    @RequestMapping("upGetPwd")
    public String upGetPwd(HttpServletRequest request, Model model) {
        String membername = request.getParameter("membername");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        Memberinfo mer = mapper.selectMemPadd(membername, email);
        if (mer != null) {
            MD5 md5 = new MD5();
            password = md5.GetMD5Code(password);
            mer.setPassword(password);
            mapper.updateByPrimaryKey(mer);
            return "login";
        } else {
            model.addAttribute("msg", "用户名或邮箱错误");
            return "GetPwd3";
        }
    }
}
