package com.ecommerce.couponcode.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import com.ecommerce.couponcode.dao.CouponCodeRepository;
import com.ecommerce.couponcode.model.Coupon;
import com.ecommerce.couponcode.validator.CouponCodeValidator;

@Configuration
public class CouponService {

	@Autowired
	static
	CouponCodeRepository repository;

	public static Coupon findByCouponCode(String code) {
		Coupon coupon = null;
		try {
			 CouponCodeValidator.validateCode(code);
			 CouponCodeValidator.validateDate(coupon);
			 
			coupon = repository.findByCouponCode(code);
			
			System.out.println(coupon);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return coupon;
		
	}

}
