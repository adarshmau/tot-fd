package com.example.totfd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.totfd.entity.WebSite;
import com.example.totfd.service.WebSiteService;

@SpringBootApplication
public class TotFdApplication implements CommandLineRunner{

	@Autowired
	private WebSiteService webSiteService;
	
	public static void main(String[] args) {
		SpringApplication.run(TotFdApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		WebSite website = new WebSite();
		website.setHome("home Content from db");
		website.setContactUs("contactUs from db");
		website.setOurCareers("ourCarrers from db");
		website.setOurClients("ourClients from db");
		website.setOurProducts("ourProducts from db");
		website.setOurServices("ourServices from db");
		website.setAboutUs("aboutUs from db");
		webSiteService.save(website);
	}
	
}
