package com.shinowit.web;

import com.shinowit.tools.Email;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2014/12/29.
 */
@Controller
@RequestMapping(value = "/email")
public class EmailController {
    @Resource
    private Email mail;

    @RequestMapping(value = "/sendmail")
    public void sendMail(@RequestParam("recv_address") String recv_address, @RequestParam("email_title") String email_title, @RequestParam("email_content") String email_content) {
        mail.sendMail(email_title, email_content, recv_address);
    }
}
