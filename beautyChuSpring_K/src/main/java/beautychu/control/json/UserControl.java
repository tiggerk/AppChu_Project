package beautychu.control.json;

import java.util.HashMap;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import beautychu.domain.Member;
import beautychu.service.MemberService;


@Controller("json.userControl")
@RequestMapping("/json/user")
public class UserControl {
  @Autowired MemberService memberService;
  @Autowired ServletContext servletContext;


  @RequestMapping("/viewPphoto")
  public Object viewPphoto(String email, String password, Model model) throws Exception {
    Member member = memberService.validate(email, password);
        //getList(email);//뭐냐 겟은 ㅅㅂ
    
    HashMap<String, Object> resultMap = new HashMap<>();
    resultMap.put("member", member);
    resultMap.put("pphoto", member.getProfilePhoto());
    return resultMap;
  }

  @RequestMapping("/updateUser")
  public Object updateUser(String email, String name, String phone, String address,
      String password,/* String profilePhoto, */HttpSession session)	throws Exception {

    Member member = new Member();
    member.setEmail(email);
    member.setName(name);
    member.setAddress(address);
    member.setPhone(phone);
    member.setPassword(password);
    //member.setProfilePhoto("\\" + profilePhoto);
    // System.out.println("update profilePhoto - " + profilePhoto);

    memberService.updateUser(member);

    HashMap<String, Object> resultMap = new HashMap<>();

    session.setAttribute("loginUser", member);
    resultMap.put("status","success");
    resultMap.put("loginUser", member);

    return resultMap;
  }

  @RequestMapping("/deleteUser")
  public Object deleteUser(String email, String name, String address, 
      String phone, String password, HttpSession session) throws Exception {

    Member member = new Member();
    member.setEmail(email);
    memberService.deleteUser(member);

    HashMap<String, Object> resultMap = new HashMap<>();

    resultMap.put("status", "success");
    resultMap.remove("loginUser", member);
    session.invalidate();

    return resultMap;

  }



}
