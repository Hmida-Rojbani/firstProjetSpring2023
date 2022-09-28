package de.tekup.firstdemob.controllers;

import de.tekup.firstdemob.services.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexCtrl {
    @Autowired
     @Qualifier("indexServiceImpl")
    private IndexService service;
    @Autowired
    @Qualifier("indexServiceImplV2")
    private IndexService service2;

    @RequestMapping(path={"/index","/hello"})
    @ResponseBody
    public String hello(){
        return service.getHello()+"<br>"+service2.getHello();
    }

    @RequestMapping(path="/hi")
    @ResponseBody
    public String hello2(){
        return "<h1>hi GLSI-B</h1>";
    }

}
