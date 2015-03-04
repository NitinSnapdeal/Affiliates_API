package com.snapdeal.promotions.model;

import java.net.URL;
import java.util.List;

public class TopOffer {

	private String title;
	private String description;
	private URL url;
	private List<ImageURL> imageUrls;
	private String availability;

	
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public URL getUrl() {
		return url;
	}

	public void setUrl(URL url) {
		this.url = url;
	}

	public List<ImageURL> getImageUrls() {
		return imageUrls;
	}

	public void setImageUrls(List<ImageURL> imageUrls) {
		this.imageUrls = imageUrls;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public TopOffer() {
		super();
	}

	public TopOffer(String title, String description, URL url,
			List<ImageURL> imageUrls, String availability) {
		super();
		this.title = title;
		this.description = description;
		this.url = url;
		this.imageUrls = imageUrls;
		this.availability = availability;
	}

}
