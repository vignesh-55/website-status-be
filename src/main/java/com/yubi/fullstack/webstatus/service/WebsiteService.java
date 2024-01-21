package com.yubi.fullstack.webstatus.service;

import com.yubi.fullstack.webstatus.domain.Website;

import java.util.List;

public interface WebsiteService {
    String addWebsite(Website website);
    List<Website> getAllWebsites();
}
