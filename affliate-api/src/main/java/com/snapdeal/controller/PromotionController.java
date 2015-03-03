package com.snapdeal.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mangofactory.swagger.plugin.EnableSwagger;
import com.snapdeal.model.Deals;
import com.snapdeal.model.Promotion;
import com.snapdeal.service.PromotionService;
import com.wordnik.swagger.annotations.ApiOperation;

@RestController
@EnableSwagger
public class PromotionController {


	@Resource
	private PromotionService promotionService;

	@ApiOperation(value="get list of active promotions")
	@RequestMapping(value ="/promotions", method= RequestMethod.GET)
	public List<Promotion> getListOfPromotions(){
		return promotionService.getactivePromotionList();

	}
	@ApiOperation(value="get deals of the day")
	@RequestMapping(value ="/deals", method= RequestMethod.GET)
	public List<Deals> getDOTD(){
		return promotionService.getDOTD();

	}

}
