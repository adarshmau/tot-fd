package com.example.totfd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.totfd.entity.WebSite;
import com.example.totfd.repository.WebSiteRepository;


@Service
public class WebSiteService {

	@Autowired
	private WebSiteRepository totFdRepository ;
	
	public WebSite save(WebSite website)
	{
		return totFdRepository.save(website);
	}
	
	public WebSite read()
	{
		return totFdRepository.findById(1).get();
	}
}