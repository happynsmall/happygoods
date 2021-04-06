package com.springboot.microservices.sample.data;

/*
 * Data(Persistent) Layer: UserDao
 */

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;


import com.springboot.microservices.sample.model.Goods;

@Mapper
public interface GoodsDao {
 
	/**
	 * 아이디로 사용자 정보 조회하
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	Goods selectGoodsById(String goodsCd) throws Exception;	
	
	

}
			