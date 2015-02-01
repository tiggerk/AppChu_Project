package beautychu.control.json;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import beautychu.domain.ShopDetail;
import beautychu.service.ShopService;

@Controller("json.shopControl")
@RequestMapping("/json/shop")
public class ShopControl {
//	static Logger log = Logger.getLogger(ProductControl.class);

	@Autowired
	ShopService shopService;

	
	@RequestMapping("/view")
	public Object view(String mail,Model model) throws Exception {
		ShopDetail shopDetail = shopService.get(mail);
		
		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("shop", shopDetail);
		resultMap.put("photos", shopDetail.getShopPhoto());
		return resultMap;
	}
	
	@RequestMapping("/list")
	public Object list() throws Exception {

		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("shopList", shopService.getShopList());
		return resultMap;
	}

}
