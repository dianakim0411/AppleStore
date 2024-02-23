package com.springlec.base.dao;

import java.util.List;

import com.springlec.base.model.CartDto;

public interface CartDao {
	/*--------------------------------------
	 * Description: cartList  Dao
	 * Author :  KBS
	 * Date : 2024.02.22
	 * Update : 2024.02.22 KBS 
	 * 		1. 리스트 출력과 수량 업데이트 다오 추가 
	 * Update : 2024.02.23 KBS
	 *      1. 장바구니 삭제 다오 추가 
	 *-------------------------------------- 
	 */
	// 장바구니 리스트 출력
	public List<CartDto> cartlistdao(String userId) throws Exception;
	// 장바구니 상품 수량 변경
	public void updateqty(String cart_qty, String cart_code) throws Exception;
	// 장바구니 상품 삭제
	public void deleteCart(String selected) throws Exception;
	
}
