package beautychu.control.json;

import java.util.HashMap;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import beautychu.domain.Member;
import beautychu.domain.Style;
import beautychu.service.MemberService;
import beautychu.service.StyleService;

@Controller("json.dbtestControl")
@RequestMapping("/json/style")
public class dbtestControl {
	@Autowired
	StyleService styleService;

	@RequestMapping("/add")
	public Object join(String people, String gender,String stylelength, String stylename,String styleintro,int skillTime,int price,String email,HttpSession session) throws Exception {
		Style style = new Style();
		style.setPeople(people);
		style.setGender(gender);
		style.setStyleLength(stylelength);
		style.setStyleName(stylename);
		style.setStyleIntro(styleintro);
		style.setPrice(price);
		style.setEmail(email);
		styleService.insertStyle(style);
		
		
		HashMap<String, Object> resultMap = new HashMap<>();

		session.setAttribute("addStyle", style);
		resultMap.put("status", "success");
		resultMap.put("addStyle", style);
		return resultMap;
	}
}
