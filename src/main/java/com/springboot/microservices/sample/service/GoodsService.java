package com.springboot.microservices.sample.service;

/*
 * Service Layer: UserService
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springboot.microservices.sample.domain.TestDomain;
import com.springboot.microservices.sample.domain.GoodsDomain;
import com.springboot.microservices.sample.model.Goods;

@Service
public class GoodsService {
	@Autowired
	private GoodsDomain goodsDomain;
 
 
	public ResponseEntity <Goods> getUserById(String GoodsCd) { 
		return goodsDomain.getUserById(GoodsCd);
	}
 
}
