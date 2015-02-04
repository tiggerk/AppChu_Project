package beautychu.dao;

import java.util.HashMap;
import java.util.List;

import beautychu.domain.Coupon;

public interface CouponDao {

  List<?> viewCoupon(HashMap params);
  List<?> couponList(HashMap params);
  
  void checkCoupon(Coupon coupon);
}