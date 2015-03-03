package com.snapdeal.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mangofactory.swagger.plugin.EnableSwagger;
import com.snapdeal.model.TopOffer;
import com.snapdeal.service.TopOffersService;
import com.wordnik.swagger.annotations.ApiOperation;

@RestController
@EnableSwagger
public class TopOfferController {

	@Resource
	private TopOffersService topOffersService;

	@ApiOperation(value = "get list of top offers")
	@RequestMapping(value = "/offer/top", method = RequestMethod.GET)
	public List<TopOffer> getListOfTopOffer() {
		return topOffersService.getactiveTopOffersList();
	}
}
