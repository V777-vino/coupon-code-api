package com.ecommerce.couponcode.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "coupon")
public class Coupon {

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "coupon_id")
	private Integer couponId;

	@Column(name = "coupon_code")
	private String couponCode;

	@Column(name = "start_date")
	private LocalDate startDate;

	@Column(name = "end_date")
	private LocalDate endDate;

	@Column(name = "discount_in_percentage")
	private Integer discountInPercentage;
}
