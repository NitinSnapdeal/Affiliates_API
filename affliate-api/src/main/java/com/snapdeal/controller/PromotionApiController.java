package com.snapdeal.controller;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mangofactory.swagger.plugin.EnableSwagger;
import com.snapdeal.model.Promotion;
import com.snapdeal.service.PromotionService;
import com.wordnik.swagger.annotations.ApiOperation;



@RestController
@EnableSwagger
public class PromotionApiController {
	



		@Resource
		private PromotionService promotionService;
		
		@ApiOperation(value="get list of products")
		@RequestMapping(value ="/promotions", method= RequestMethod.GET)
		public List<Promotion> getListOfPromotions(){
			return promotionService.getactivePromotionList();

	}


}
