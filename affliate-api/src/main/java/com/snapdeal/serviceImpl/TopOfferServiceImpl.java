package com.snapdeal.serviceImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.snapdeal.model.ImageURL;
import com.snapdeal.model.TopOffer;
import com.snapdeal.service.TopOffersService;
import com.snapdeal.util.AvailabilityConstants;


@Component
public class TopOfferServiceImpl implements TopOffersService {

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
