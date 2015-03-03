package com.snapdeal.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.snapdeal.model.Promotion;
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

}
