package com.springboot.microservices.sample.model;

//import lombok.Data;

public class NegoGoodsPrice {
	private String  GoodsCd; 
	private String  GoodsPrice;

	public NegoGoodsPrice() {
		
	}
	
	
	
	public String getGoodsCd() {
		return GoodsCd;
	}



	public void setGoodsCd(String goodsCd) {
		GoodsCd = goodsCd;
	}




	public String getGoodsPrice() {
		return GoodsPrice;
	}



	public void setGoodsPrice(String goodsPrice) {
		GoodsPrice = goodsPrice;
	}


 
}