package beautychu.control.json;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import beautychu.domain.Coupon;
import beautychu.domain.Member;
import beautychu.service.CouponService;

@Controller("json.couponControl")
@RequestMapping("/json/coupon")
public class CouponControl {
  
  @Autowired CouponService couponService;
  
   
  @RequestMapping("/viewCouponList")
  public Object viewCouponList(Coupon coupon, HttpSession session) throws Exception {
    
    Member member =  (Member) session.getAttribute("loginUser");
    if (session.getAttribute("loginUser") != null) {
      coupon.setcEmail(member.getEmail());
    
      couponService.viewCoupon(coupon);
    }

    
    HashMap<String, Object> resultMap = new HashMap<>();
    resultMap.put("viewCoupon", couponService.viewCoupon(coupon));
    
    System.out.println("coupon Data -----> " + resultMap);
    return resultMap;
    
  }
}
