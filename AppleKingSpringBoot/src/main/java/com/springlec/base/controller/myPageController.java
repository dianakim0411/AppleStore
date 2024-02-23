package com.springlec.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springlec.base.model.OrderDto;
import com.springlec.base.service.OrderDaoService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class myPageController {
	
	/*--------------------------------------
	 * Description: cartList 컨트롤러
	 * Author :  DK, LS 
	 * Date : 2024.02.22
	 * Update : 2024.02.22 DK, LS 
	 * 		1. OrderDaoService를 사용하여 사용자와 관련된 주문 목록을 가져옵
	 *      2. 세션에서 사용자 정보를 가져와서 userId, userName, userRank 및 regDate를 검색
	 *-------------------------------------- 
	 */

	@Autowired
	OrderDaoService service;
	
	@GetMapping("/myPage")
    public String myInfo(HttpSession session, HttpServletRequest request, Model model) throws Exception {
		
		String userId = "pdg";
		String userName = "박동근";
		int    userRank = 1;
		String regDate = "2023.01.20";
		
		if( session.getAttribute("userId") != null ){
			userId = (String)session.getAttribute("userId");
		}
		if( session.getAttribute("userName") != null ){
			userName = (String)session.getAttribute("userName");
		}
		if( session.getAttribute("userRank") != null ){
			userRank = Integer.parseInt((String)session.getAttribute("userRank"));
		}
		if( session.getAttribute("regDate") != null ){
			regDate = (String)session.getAttribute("regDate");
		}
		
		List<OrderDto> orderList = service.OrderDao(userId);
		model.addAttribute("order", orderList);
		
        session.setAttribute("userId", userId);
        session.setAttribute("userName", userName);
        session.setAttribute("userRank", userRank);
        session.setAttribute("regDate", regDate);
       
        return "myPage"; 
    }
}//CONTROLLER END