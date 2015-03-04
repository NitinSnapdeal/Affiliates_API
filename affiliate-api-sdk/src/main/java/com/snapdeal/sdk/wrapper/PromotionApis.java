package com.snapdeal.sdk.wrapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.springframework.web.client.RestTemplate;

import com.snapdeal.sdk.model.Deals;
import com.snapdeal.sdk.model.Promotion;
import com.snapdeal.sdk.model.TopOffer;


public class PromotionApis {

	private Properties getpropertiesLoader(){
		Properties properties= new Properties();
		InputStream inputStream= getClass().getClassLoader().getResourceAsStream("service.properties");
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;

	}


	public List<Promotion> getListOfPromotions(){
		RestTemplate restTemplate= new RestTemplate();
		List <Promotion> listofActivePromotions= new ArrayList<Promotion>();
		listofActivePromotions=
				restTemplate.getForObject(getpropertiesLoader().getProperty("promotions.api"), ArrayList.class);
		return listofActivePromotions;
	}

	public List<Deals> getDOTD(){
		RestTemplate restTemplate= new RestTemplate();
		List <Deals> listofDeals= new ArrayList<Deals>();
		listofDeals=
				restTemplate.getForObject(getpropertiesLoader().getProperty("deals.api"), ArrayList.class);
		return listofDeals;
	}

	public List<TopOffer> getTopOffers(){
		RestTemplate restTemplate= new RestTemplate();
		List <TopOffer> listofTopOffers= new ArrayList<TopOffer>();
		listofTopOffers=
				restTemplate.getForObject(getpropertiesLoader().getProperty("topOffers.api"), ArrayList.class);
		return listofTopOffers;
	}


}
