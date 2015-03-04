package com.snapdeal.sdk.model;

public class Promotion {
	
	private String promtionName;
	
	private String promoCode;

	public String getPromtionName() {
		return promtionName;
	}

	public void setPromtionName(String promtionName) {
		this.promtionName = promtionName;
	}

	public String getPromoCode() {
		return promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}

	@Override
	public String toString() {
		return "Promotion [promtionName=" + promtionName + ", promoCode="
				+ promoCode + "]";
	}
	
	
	
	
}
