package com.example.totfd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.totfd.entity.WebSite;
import com.example.totfd.service.WebSiteService;

@RestController
@RequestMapping("webSite1")
@CrossOrigin
public class WebSiteController {
	
	@Autowired
	private WebSiteService totFdService;
	
	@GetMapping("load")
	public ResponseEntity<WebSite> load()
	{
		return ResponseEntity.ok(totFdService.read());
	}

}
