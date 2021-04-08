package com.springboot.microservices.sample.domain;

/*
 * Domain(Business) Layer: UserDomain
 */

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springboot.microservices.sample.data.GoodsDao;
import com.springboot.microservices.sample.model.Goods;
import com.springboot.microservices.sample.model.NegoGoodsPrice;

@Service
public class GoodsDomain {
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private GoodsDao sampleGoodsDao;
 
	/*
	 * getUserById: userId에 해당하는 사용자정보 리턴 
	 */
	public ResponseEntity <Goods> getGoodsById(String goodsCd) { 
		Goods re = null;
		try {
			log.info("Start db select");
			re = sampleGoodsDao.selectGoodsById(goodsCd);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<Goods> (re, HttpStatus.OK);
	}
	
	public ResponseEntity <NegoGoodsPrice> getGoodsPriceById(String goodsCd) { 
		NegoGoodsPrice re = null;
		try {
			log.info("Start db select");
			re = sampleGoodsDao.selectGoodsPriceById(goodsCd);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<NegoGoodsPrice> (re, HttpStatus.OK);
	}
	
}
