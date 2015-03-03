package com.snapdeal.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.snapdeal.model.Deals;
import com.snapdeal.model.Promotion;
import com.snapdeal.promotions.utility.Contants;
import com.snapdeal.service.PromotionService;

@Component
public class PromotionServiceImpl implements PromotionService {

	@Override
	public List<Promotion> getactivePromotionList() {
		Promotion promotion= new Promotion();
		promotion.setPromoCode("APP25");
		promotion.setPromtionName("HOLI OFFER");
		List<Promotion> promotionList= new ArrayList<Promotion>();
		promotionList.add(promotion);
		return promotionList;
		
	}

	@Override
	public List<Deals> getDOTD() {
		Deals deals = new Deals();
		deals.setAvailability(Contants.IN_STOCK);
		deals.setDecription("Artificial flowers,plants & vases");
		deals.setUrl("http://www.snapdeal.com/offers/mobile-app?");
		deals.setTitle("Flat 40% Off");
		List<String> listofImages= new ArrayList<String>();
		listofImages.add("http://www.snapdeal.com/product/sandisk-cruzer-blade-8-gb/141951");
		deals.setImageUrls(listofImages);
		List<Deals> dealsList= new ArrayList<Deals>();
		dealsList.add(deals);
		return dealsList;
	}

}
