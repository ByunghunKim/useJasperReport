package com.github.byunghunkim.usejasperreport.report;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class ReportController {
    
    @GetMapping(value="/")
    public String index() {
        return "/index";
    }
    
    @PostMapping(value="/report")
    public String report() {
        // todo. set jasper report to preview
        return "index";
    }
    
}
