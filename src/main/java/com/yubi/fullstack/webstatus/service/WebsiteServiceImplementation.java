package com.yubi.fullstack.webstatus.service;

import com.yubi.fullstack.webstatus.domain.Website;
import com.yubi.fullstack.webstatus.repository.WebsiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebsiteServiceImplementation implements WebsiteService{

    @Autowired
    private WebsiteRepository websiteRepository;

    @Override
    public List<Website> getAllWebsites(){
        return websiteRepository.findAll();
    }
    @Override
    public String addWebsite(Website website) {
        websiteRepository.save(website);
        return "Website added";
    }
}
