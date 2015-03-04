package com.snapdeal.service;

import java.util.List;

import com.snapdeal.model.Deals;
import com.snapdeal.model.Promotion;
import com.snapdeal.model.TopOffer;

public interface PromotionService {
	
	public List<Promotion> getactivePromotionList();

	public List<Deals> getDOTD();
	
	public List<TopOffer> getactiveTopOffersList();

}
