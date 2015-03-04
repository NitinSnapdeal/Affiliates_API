package com.snapdeal.sdk.model;

import java.util.List;

public class Deals {
	
	private String title;
	
	private String decription;
	
	private String url;
	
	private List<String> imageUrls;
	
	private String availability;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<String> getImageUrls() {
		return imageUrls;
	}

	public void setImageUrls(List<String> imageUrls) {
		this.imageUrls = imageUrls;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	@Override
	public String toString() {
		return "Deals [title=" + title + ", decription=" + decription
				+ ", url=" + url + ", imageUrls=" + imageUrls
				+ ", availability=" + availability + "]";
	}
	
	

}
