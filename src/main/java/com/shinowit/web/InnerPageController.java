package com.shinowit.web;

import com.shinowit.dao.mapper.MerchandiseinfoMapper;
import com.shinowit.entity.Merchandiseinfo;
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
public class InnerPageController {
    @Resource
    private MerchandiseinfoMapper merchandiseinfoMapper;

    @RequestMapping("inner-page")
    public String innerPage(Merchandiseinfo merchandiseinfo, HttpServletRequest request, Model model) {
        String id = request.getParameter("id");
        merchandiseinfo = merchandiseinfoMapper.selectByPrimaryKey(id);
        model.addAttribute("mercha", merchandiseinfo);
        return "inner-page";
    }

    @RequestMapping(value = "buyNow")
    public String buy() {
        return "chart01";
    }
}


