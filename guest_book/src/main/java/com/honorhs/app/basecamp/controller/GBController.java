package com.honorhs.app.basecamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
import com.honorhs.app.basecamp.service.GBService;
 
@Controller
public class GBController {
     
    @Autowired
    GBService GBService;
     
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {
         
        model.addAttribute("GB", GBService.getGBList());       
         
        return "/GB/guest_book";
    }
     
}