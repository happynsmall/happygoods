package com.springboot.microservices.sample.presentation;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.microservices.sample.model.Goods;
import com.springboot.microservices.sample.model.NegoGoodsPrice;
import com.springboot.microservices.sample.service.GoodsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

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
				@PathVariable (name="goodsCd", required = true) String goodsCd, HttpServletResponse response
			) 
	{ 
		 
		response.addHeader("access-control-allow-credentials", "true");
		response.addHeader("access-control-allow-origin", "http://nsmall.front.169.56.84.35.nip.io");

 
 
		return goodsService.getGoodsPriceById(goodsCd);
	}
 
}