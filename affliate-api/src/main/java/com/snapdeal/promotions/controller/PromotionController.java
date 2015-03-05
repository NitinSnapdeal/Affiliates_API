package com.snapdeal.promotions.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.snapdeal.promotions.model.Deals;
import com.snapdeal.promotions.model.Promotion;
import com.snapdeal.promotions.model.TopOffer;
import com.snapdeal.promotions.service.PromotionService;
import com.wordnik.swagger.annotations.ApiOperation;



@RestController
public class PromotionController {

	
	@Resource
	private PromotionService promotionService;

	@ApiOperation(value = "get list of active promotions")
	@RequestMapping(value = "/promotions", method = RequestMethod.GET)
	public List<Promotion> getListOfPromotions() {
		return promotionService.getactivePromotionList();

	}

	@ApiOperation(value = "get deals of the day")
	@RequestMapping(value = "/deals", method = RequestMethod.GET)
	public List<Deals> getDOTD() {
		return promotionService.getDOTD();

	}

	@ApiOperation(value = "get list of top offers")
	@RequestMapping(value = "/topOffers", method = RequestMethod.GET)
	public  List<TopOffer> getListOfTopOffer() {
		return promotionService.getactiveTopOffersList();
		
	}

	
	
	
	
}
