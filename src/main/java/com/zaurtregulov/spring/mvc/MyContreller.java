package com.zaurtregulov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyContreller {


    @RequestMapping("/")
    public String showMyView(){
        return "myView";
    }

    @RequestMapping("/askDeteils")
    public String askDeteils(){
        return "askDeteils";
    }

    @RequestMapping("/showDetails")
    public String showDetails(){
        return "showDetails";
    }



}
