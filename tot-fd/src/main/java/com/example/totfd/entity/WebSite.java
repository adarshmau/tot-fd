package com.example.totfd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class WebSite  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	 private String home;
	 private String  aboutUs;
	 private String  contactUs;
	 private String   ourServices;
	 private String   ourProducts;
	 private String   ourClients;
	 private String    OurCareers;
	


}
