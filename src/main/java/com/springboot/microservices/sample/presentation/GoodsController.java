package com.springboot.microservices.sample.presentation;

/*
 * Presentation Layer: UserController
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


import com.springboot.microservices.sample.model.Goods;
import com.springboot.microservices.sample.model.NegoGoodsPrice;
import com.springboot.microservices.sample.service.GoodsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@Api(value="Goods API")
@RestController
public class GoodsController {

	@Autowired
	private GoodsService goodsService;
	
  
	@GetMapping("/product/{goodsCd}")
	@ApiOperation(value="아이디로 사용자 정보 가져오기 ")
	public ResponseEntity <Goods> getGoodsById(
				@PathVariable (name="goodsCd", required = true) String goodsCd
			) { 
		return goodsService.getGoodsById(goodsCd);
	}
	
	@GetMapping("/nego/{goodsCd}")
	@ApiOperation(value="아이디로 사용자 정보 가져오기 ")
	public ResponseEntity <NegoGoodsPrice> getGoodsPriceById(
				@PathVariable (name="goodsCd", required = true) String goodsCd
			) { 
		return goodsService.getGoodsPriceById(goodsCd);
	}
 
}