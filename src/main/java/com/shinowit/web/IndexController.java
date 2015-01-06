package com.shinowit.web;

import com.shinowit.dao.mapper.MerchandisecinfoMapper;
import com.shinowit.dao.mapper.MerchandiseinfoMapper;
import com.shinowit.entity.Merchandisecinfo;
import com.shinowit.entity.Merchandiseinfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2014/12/25.
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @Resource
    private MerchandisecinfoMapper mapper;
    @Resource
    private MerchandiseinfoMapper mapperMercha;

    @RequestMapping("index")
    public String index(Model model) {
        List<Merchandisecinfo> merchandisecinfos = selectMemCla();
        model.addAttribute("merchandC", merchandisecinfos);//所有的商品分类
        List<Merchandiseinfo> merchandiseinfos = selectMemcha();
        model.addAttribute("merchan", merchandiseinfos);//index页面展示的8个商品
        int i = (int) (Math.random() * merchandiseinfos.size());
        Merchandisecinfo merchandisecinfo = selectOneMemcha(merchandisecinfos.get(i).getMerchandisecid());
        model.addAttribute("merchandise", merchandisecinfo);//单个商品类
        List<Merchandiseinfo> merchandiseinfoList = selectMerchandiseinfoList(merchandisecinfo.getMerchandisecid());//
        model.addAttribute("merchandiseinfoList", merchandiseinfoList);//商品的列表
        return "index";
    }

    @RequestMapping("inner-pageMerchandise")
    @ResponseBody
    public List<Merchandiseinfo> selectMerchandise(HttpServletRequest request) {
        String id = request.getParameter("id");
        List<Merchandiseinfo> merchandiseinfos = new ArrayList<Merchandiseinfo>();
        try {
            merchandiseinfos = queryMerchandisec(id);
//            model.addAttribute("merchan",merchandiseinfos);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return merchandiseinfos;
    }

    public List<Merchandiseinfo> queryMerchandisec(String merchandisecId) {
        List<Merchandiseinfo> merchandiseinfos = new ArrayList<Merchandiseinfo>();
        try {
            merchandiseinfos = mapperMercha.selectMerchandiseList(merchandisecId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return merchandiseinfos;
    }

    public List<Merchandisecinfo> selectMemCla() {
        List<Merchandisecinfo> merchandisecinfos = mapper.selectMerchandisecinfo();
        return merchandisecinfos;
    }

    public List<Merchandiseinfo> selectMemcha() {
        List<Merchandiseinfo> merchandiseinfos = new ArrayList<Merchandiseinfo>();
        try {
            merchandiseinfos = mapperMercha.selectMerchandise();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return merchandiseinfos;
    }

    public Merchandisecinfo selectOneMemcha(String id) {
        Merchandisecinfo merchandisecinfo = mapper.selectByPrimaryKey(id);
        return merchandisecinfo;
    }

    public List<Merchandiseinfo> selectMerchandiseinfoList(String id) {
        List<Merchandiseinfo> merchandiseinfos = mapperMercha.selectMerchandiseList(id);
        return merchandiseinfos;
    }
}
