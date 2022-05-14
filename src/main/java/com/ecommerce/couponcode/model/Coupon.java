package com.ecommerce.couponcode.model;

import java.time.LocalDate;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="coupon")
public class Coupon {
	
private Integer id;
private Integer couponId;
private String couponCode;
private LocalDate startDate;
private LocalDate endDate;
}
