package com.yubi.fullstack.webstatus.controller;

import com.yubi.fullstack.webstatus.domain.Website;
import com.yubi.fullstack.webstatus.service.WebsiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/websites")
@CrossOrigin(origins = "http://localhost:3000")
public class WebsiteApiResource {
    @Autowired
    private WebsiteService websiteService;

    @GetMapping("/getall")
    public List<Website> getAllWebsites(){
        return websiteService.getAllWebsites();
    }

    @PostMapping
    public String addWebsite(@RequestBody Website website){
        return websiteService.addWebsite(website);
    }
}
