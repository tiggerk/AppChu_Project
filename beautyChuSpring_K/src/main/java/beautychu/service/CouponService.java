package beautychu.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import beautychu.dao.CouponDao;
import beautychu.dao.MemberDao;
import beautychu.domain.Coupon;

@Service
public class CouponService {
  @Autowired CouponDao couponDao;
  @Autowired MemberDao memberDao;

   
public List<?> viewCoupon(Coupon coupon) {
  
  HashMap<String, String> params = new HashMap<>();
  String cEmail = coupon.getcEmail();
  params.put("cEmail", cEmail);
  return couponDao.viewCoupon(params);
}

public void checkCoupon(Coupon coupon) {
  couponDao.checkCoupon(coupon);
}

}
