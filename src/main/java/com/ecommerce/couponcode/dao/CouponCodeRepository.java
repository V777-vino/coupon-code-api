package com.ecommerce.couponcode.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.couponcode.model.Coupon;

@Repository
public interface CouponCodeRepository extends JpaRepository<Coupon, Integer> {

	static void findByCode(String couponCode) {
		// TODO Auto-generated method stub
		
	}

}
