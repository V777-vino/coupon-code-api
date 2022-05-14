package com.ecommerce.couponcode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.ecommerce.couponcode.dao.CouponCodeRepository;



@Configuration
public class CouponService {
	@Autowired
	CouponCodeRepository couponCodeRepository;
	@Autowired
	CouponCodeRepository couponCodeValidator;
	
}
