package com.springboot.microservices.sample.service;

/*
 * Service Layer: UserService
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.springboot.microservices.sample.domain.GoodsDomain;
import com.springboot.microservices.sample.model.Goods;
import com.springboot.microservices.sample.model.NegoGoodsPrice;

@Service
public class GoodsService {
	@Autowired
	private GoodsDomain goodsDomain;
 
 
	public ResponseEntity <Goods> getGoodsById(String GoodsCd) { 
		return goodsDomain.getGoodsById(GoodsCd);
	}
	
	public ResponseEntity <NegoGoodsPrice> getGoodsPriceById(String GoodsCd) { 
		return goodsDomain.getGoodsPriceById(GoodsCd);
	}
	
 
}
