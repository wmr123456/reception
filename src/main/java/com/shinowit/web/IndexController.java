package com.shinowit.web;

import com.shinowit.dao.mapper.MerchandisecinfoMapper;
import com.shinowit.entity.Merchandisecinfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2014/12/25.
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @Resource
    private MerchandisecinfoMapper mapper;
    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @RequestMapping("merchan")
    public void selectMemCla(Model model) {
        List<Merchandisecinfo> merchandisecinfos = mapper.selectMerchandisecinfo();
        System.out.println(merchandisecinfos.size());
        for (int i = 0; i < merchandisecinfos.size(); i++) {
            System.out.println(merchandisecinfos.get(i).getMerchandisecname());
        }
        model.addAttribute("merchanList", merchandisecinfos);
    }
}
