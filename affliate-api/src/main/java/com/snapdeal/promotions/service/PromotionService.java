package com.snapdeal.promotions.service;

import java.util.List;

import com.snapdeal.promotions.model.Deals;
import com.snapdeal.promotions.model.Promotion;
import com.snapdeal.promotions.model.TopOffer;

public interface PromotionService {
	
	public List<Promotion> getactivePromotionList();

	public List<Deals> getDOTD();
	
	public List<TopOffer> getactiveTopOffersList();

}
