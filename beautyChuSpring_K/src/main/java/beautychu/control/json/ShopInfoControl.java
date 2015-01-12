package beautychu.control.json;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import beautychu.domain.ShopInfo;
import beautychu.service.ShopInfoService;

@Controller("json.ShopInfoControl")
@RequestMapping("/json/shop")
public class ShopInfoControl {
	@Autowired
	ShopInfoService shopInfoService;

	@RequestMapping("/update")
	public Object info(String licenseeNo, String shopName, String shopAddr,
			String shopTel, String shopIntro, HttpSession session) throws Exception {
		
		ShopInfo shopInfo = new ShopInfo();
		shopInfo.setLicenseeNo(licenseeNo);
		shopInfo.setShopName(shopName);
		shopInfo.setShopAddr(shopAddr);
		shopInfo.setShopTel(shopTel);
		shopInfo.setShopIntro(shopIntro);
		shopInfo.setEmail("aa@gmail.com");
		shopInfoService.insertShopInfo(shopInfo);
		
		
		HashMap<String, Object> resultMap = new HashMap<>();

		session.setAttribute("addShopInfo", shopInfo);
		resultMap.put("status", "success");
		resultMap.put("addShopInfo", shopInfo);
		return resultMap;
	}
}
