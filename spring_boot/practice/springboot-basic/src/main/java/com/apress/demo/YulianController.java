package com.apress.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ch.qos.logback.core.model.Model;

@Controller
public class YulianController {
    @RequestMapping("/")
   public String home(Model model) {
        return "index.html";
    
   } 
}
