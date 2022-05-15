package com.ecommerce.couponcode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import com.ecommerce.couponcode.dao.CouponCodeRepository;
import com.ecommerce.couponcode.model.Coupon;
import com.ecommerce.couponcode.validator.CouponCodeValidator;

@Configuration
public class CouponService {

	@Autowired
	CouponCodeValidator couonCodeValidator;

	@Autowired
	CouponCodeRepository repository;

	public Coupon findByCouponCode(String couponCode) throws Exception{
		
		Coupon coupon = repository.findByCouponCode(couponCode).orElseThrow(()->new Exception ("Invaid coupon code"));
		CouponCodeValidator.validateCode(couponCode);
		CouponCodeValidator.validateDate(coupon);
		System.out.println(coupon);
		return coupon;

	}

}
