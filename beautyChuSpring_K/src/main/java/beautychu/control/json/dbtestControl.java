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

/*	@RequestMapping(value = "/loginUser", method = RequestMethod.GET)
	public Object loginUser(HttpSession session) throws Exception {
		HashMap<String, Object> resultMap = new HashMap<>();

		if (session.getAttribute("loginUser") != null) {
			resultMap.put("status", "success");
			resultMap.put("loginUser", session.getAttribute("loginUser"));
		} else {
			resultMap.put("status", "fail");
		}
		return resultMap;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public Object login(String email, String password, boolean save,
			String requestUrl,  세션에 저장된 값을 달라고 하려면? 
			HttpServletResponse response, HttpSession session) throws Exception {

		if (save) { // 쿠키로 아이디 저장
			Cookie cookie = new Cookie("email", email);
			cookie.setMaxAge(60 * 60 * 24 * 15);
			response.addCookie(cookie);
		} else {
			Cookie cookie = new Cookie("email", "");
			cookie.setMaxAge(0); // 무효화시킴
			response.addCookie(cookie);
		}

		Member member = memberService.validate(email, password);

		HashMap<String, Object> resultMap = new HashMap<>();

		if (member != null) {
			resultMap.put("status", "success");
			session.setAttribute("loginUser", member);
			resultMap.put("loginUser", member);

		} else {
			session.invalidate();
			resultMap.put("status", "fail");
		}
		return resultMap;
	}

	@RequestMapping("/logout")
	public Object execute(HttpSession session) throws Exception {
		session.invalidate();
		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("status", "success");
		return resultMap;
	}

	@RequestMapping("/add")
	// @ResponseBody
	public Object join(String people, String gender,String stylelength, String stylename,String styleintro,int skilltime,int price,String email,HttpSession session) throws Exception {
		Style style = new Style();
		style.setPeople(people);
		style.setGender(gender);
		style.setStyleLength(stylelength);
		style.setStyleName(stylename);
		style.setStyleIntro(styleintro);
		style.setSkillTime(skilltime);
		style.setPrice(price);
		style.setEmail(email);
		styleService.insertStyle(style);
		
		
		HashMap<String, Object> resultMap = new HashMap<>();

		session.setAttribute("addStyle", style);
		resultMap.put("status", "success");
		resultMap.put("addStyle", style);
		return resultMap;
	}*/
}
