package com.ecommerce.couponcode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.couponcode.dao.CouponCodeRepository;
import com.ecommerce.couponcode.message.Message;
import com.ecommerce.couponcode.model.Coupon;
import com.ecommerce.couponcode.service.CouponService;

@RestController
public class CouponController {
	@Autowired
	CouponCodeRepository couponCodeRepository;

	@Autowired
	CouponService couponService;

	@GetMapping("coupon/apply-code")
	public ResponseEntity<?> findByCouponCode(@RequestParam("couponCode") String couponCode) throws Exception {
		Coupon coupon = null;
		try {
			coupon = couponService.findByCouponCode(couponCode);
		} catch (Exception e) {
			e.printStackTrace();
			Message message = new Message(e.getMessage());
			return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(coupon, HttpStatus.OK);
//		if (couponCode == coupon.getCouponCode()) {
//			return new ResponseEntity<>(coupon.getDiscountInPercentage(), HttpStatus.OK);
//		}
//
//		return new ResponseEntity<>("invalid coupon code", HttpStatus.BAD_REQUEST);
	}
}
