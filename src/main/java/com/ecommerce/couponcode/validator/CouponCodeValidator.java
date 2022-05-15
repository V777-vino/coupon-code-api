package com.ecommerce.couponcode.validator;

import java.time.LocalDate;

import org.springframework.context.annotation.Configuration;

import com.ecommerce.couponcode.model.Coupon;

@Configuration
public class CouponCodeValidator {

	

	public static void validateDate(Coupon coupon) throws Exception {

		LocalDate startDate = coupon.getStartDate();
		LocalDate endDate = coupon.getEndDate();

		if (LocalDate.now().isBefore(startDate)) {
			throw new Exception("wait for a day");
		}
//		} else if (LocalDate.now().isBefore(endDate)) {
//
//		}
		else if (LocalDate.now().isAfter(endDate)) {

			throw new Exception("Expired");
		}
//		} else if (LocalDate.now().isEqual(endDate)) {
//
//		} else if (LocalDate.now().isAfter(startDate)) {
//
//		} else if (LocalDate.now().isEqual(endDate)) {
//
//		} else if (LocalDate.now().isEqual(startDate)) {
//
//		}

	}

	public static void validateCode(String code) {
		
		
	}

}
