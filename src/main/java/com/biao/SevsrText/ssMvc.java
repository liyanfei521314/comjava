package com.biao.SevsrText;

import com.biao.haveuse.Zhixing;
import com.biao.pojo.Fan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;


@CrossOrigin
@RestController
@RequestMapping( value = "/com")
public class ssMvc {

    @Autowired
    Zhixing zhixing;

    @Autowired
    JavaMailSender mailSender;

    @Autowired
    HttpSession session;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Fan login(String name,String prw){
        Fan fan=zhixing.login(name,prw);

        return fan;
    }

    @GetMapping(value = "/info")
    public Fan info(String moduleId){
        List<String> moduleIds= Arrays.asList(moduleId.split(","));
        Fan fan=zhixing.info(moduleIds);
        return fan;
    }


    @GetMapping(value = "/emil")
    public String emil(){
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom("13674966707@163.com");
        mailMessage.setTo("1454614582@qq.com");
        mailMessage.setSubject("放假通知");
        mailMessage.setText("明天放假");
        mailSender.send(mailMessage);
        return "1";
    }

}
