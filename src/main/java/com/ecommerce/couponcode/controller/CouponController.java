package com.ecommerce.couponcode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.couponcode.dao.CouponCodeRepository;



@RestController
public class CouponController {
	@Autowired
	CouponCodeRepository couonRepository;

	
}
