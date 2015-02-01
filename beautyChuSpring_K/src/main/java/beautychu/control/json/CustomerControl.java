package beautychu.control.json;

import java.util.HashMap;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import beautychu.domain.Customer;
import beautychu.service.MemberService;

@Controller("json.CustomerControl")
@RequestMapping("/json/customer")
public class CustomerControl {
  
  @Autowired MemberService memberService;
  @Autowired ServletContext servletContext;
/*  
  @RequestMapping("/updatePPhoto")
  public Object updatePhoto(String email, String profilePhoto, HttpSession session) throws Exception {
    
    Customer customer = new Customer();
    customer.setEmail(email);
    customer.setProfilePhoto("/" + profilePhoto);
    System.out.println("update profilePhoto - " + profilePhoto);
    memberService.updatePPhoto(customer);
    
    HashMap<String, Object> resultMap = new HashMap<>();
    
    session.setAttribute("updatePPhoto", customer);
    resultMap.put("status", "success");
    resultMap.put("updatePPhoto", customer);
    
    //resultMap.put("customerPhoto", customerService.updatePhoto(customer));
    return resultMap;
  }
  */
  /*AJAX post방식*/
/*  @RequestMapping(value="/fileUpload", method=RequestMethod.POST)
  public ModelAndView fileUpload(MultipartHttpServletRequest mRequest, String email) {
    
    System.out.println("나나나"+email);
    ModelAndView mav = new ModelAndView();
    
    if(memberService.fileUpload(mRequest, email)) {
      mav.addObject("result", "success");
    } else {
      mav.addObject("result", "fail");
    }
    
    mav.setViewName("JSON");
    
    return mav;
  }*/
/*  
  @RequestMapping("/list")
  public Object list(String email, HttpSession session) throws Exception {
    
    HashMap<String, Object> resultMap = new HashMap<>();
    
    System.out.println(email);
    System.out.println(session.getServletContext().getRealPath("/fileupload/"));
    
    resultMap.put("memberlist", memberService.getList(email));
    return resultMap;
  }
 */
  
/*  @RequestMapping("/receiveCoupon")
  public Object receiveCoupon()throws Exception {
    
    HashMap<String, Object> resultMap = new HashMap<>();
    resultMap.put("cCouponList", customerService.cCouponList());
    return resultMap;
  }*/
}

