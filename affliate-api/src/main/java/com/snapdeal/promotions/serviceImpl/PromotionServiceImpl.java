package com.snapdeal.promotions.serviceImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.snapdeal.api.rest.Deals;
import com.snapdeal.promotions.model.ImageURL;
import com.snapdeal.promotions.model.Promotion;
import com.snapdeal.promotions.model.TopOffer;
import com.snapdeal.promotions.service.PromotionService;
import com.snapdeal.promotions.util.AvailabilityConstants;

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
		deals.setAvailability(AvailabilityConstants.in_stock);
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
	
	@Override
	public List<TopOffer> getactiveTopOffersList() {
		try {
			return getOffers();
		} catch (Exception e) {
			System.out.println("Exception occurred"+e);
			return null;
		}

	}

	private List<TopOffer> getOffers() throws MalformedURLException, Exception {
		List<TopOffer> offers = new ArrayList<TopOffer>();
		for (int i = 0; i < 1; i++)
			offers.add(getOffer());
		return offers;

	}

	private TopOffer getOffer() throws MalformedURLException, Exception {
		try {
			TopOffer offer = new TopOffer();
			offer.setAvailability(AvailabilityConstants.in_stock);
			offer.setDescription("Dell AMD Vostro 3445 Laptop is an unbeatable combination of stylish look and smart features. Packed with powerful AMD APU E1-6010 processor and Ubuntu 12.04 operating system, the laptop is definitely one of the best options while buying laptops. The grey coloured laptop comes with 14 inches LED WLED display screen for better view of images and videos. The 4 GB RAM and 500 GB HDD capacity of the model provides enough storage space to the users. Further, it comes installed with Mcafee 15 months antivirus. Further,Dell AMD Vostro 3445 Laptop Laptop also features 1280 x 720 (HD) webcam, touchpad and keyboard. Whether you are a professional user or a student, this Dell model is certainly the rightmost choice for all.");
			offer.setTitle("Dell AMD Vostro 3445 Laptop (AMD APU E1-6010- 4GB RAM- 500GB HDD- 14 Inches- Ubuntu) (Grey)");
			offer.setUrl(new URL(
					"http://www.snapdeal.com/product/dell-amd-vostro-3445-laptop/883109789"));
			offer.setImageUrls(getImageURLs());

			return offer;
		} catch (MalformedURLException e) {
			throw e;
		}

	}

	private List<ImageURL> getImageURLs() throws MalformedURLException {
		List<ImageURL> imageURLs = new ArrayList<ImageURL>();
		imageURLs.add(getImageURL());

		return imageURLs;

	}

	private ImageURL getImageURL() throws MalformedURLException {
		return (new ImageURL(
				new URL(
						"http://n4.sdlcdn.com/imgs/a/j/0/Dell-AMD-Vostro-3445-Laptop-SDL570566404-1-c49f7.jpg")));
	}

}
