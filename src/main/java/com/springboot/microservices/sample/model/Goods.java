package com.springboot.microservices.sample.model;

//import lombok.Data;

public class Goods {
	private String  GoodsCd; 
	private String  GoodsNm;  
	private String  GoodsPrice;
	private String  GoodsImg; 

	public Goods() {
		
	}
	
	
	
	public String getGoodsCd() {
		return GoodsCd;
	}



	public void setGoodsCd(String goodsCd) {
		GoodsCd = goodsCd;
	}



	public String getGoodsNm() {
		return GoodsNm;
	}



	public void setGoodsNm(String goodsNm) {
		GoodsNm = goodsNm;
	}



	public String getGoodsPrice() {
		return GoodsPrice;
	}



	public void setGoodsPrice(String goodsPrice) {
		GoodsPrice = goodsPrice;
	}



	public String getGoodsImg() {
		return GoodsImg;
	}



	public void setGoodsImg(String goodsImg) {
		GoodsImg = goodsImg;
	}

 
}