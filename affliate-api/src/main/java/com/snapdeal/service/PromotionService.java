package com.snapdeal.service;

import java.util.List;

import com.snapdeal.model.Deals;
import com.snapdeal.model.Promotion;

public interface PromotionService {
	
	public List<Promotion> getactivePromotionList();

	public List<Deals> getDOTD();

}
