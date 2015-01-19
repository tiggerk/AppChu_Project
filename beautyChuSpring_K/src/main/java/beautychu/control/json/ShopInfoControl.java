package beautychu.control.json;

import java.io.File;
import java.util.HashMap;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import beautychu.domain.ShopInfo;
import beautychu.service.ShopInfoService;

@Controller("json.ShopInfoControl")
@RequestMapping("/json/shop")
public class ShopInfoControl {
	
	@Autowired
	ShopInfoService shopInfoService;
	
	@Autowired
	ServletContext servletContext;
	
	/*AJAX post방식*/
	@RequestMapping(value="/fileUpload", method=RequestMethod.POST)
	public ModelAndView fileUpload(MultipartHttpServletRequest mRequest, String email) {
		
		System.out.println("나나나"+email);
		ModelAndView mav = new ModelAndView();
		
		if(shopInfoService.fileUpload(mRequest, email)) {
			mav.addObject("result", "SUCCESS");
		} else {
			mav.addObject("result", "FAIL");
		}
		
		mav.setViewName("JSON");
		
		return mav;
	}

	/* ajax get방식
	@RequestMapping(value="/fileUploadAjax", method=RequestMethod.GET)
	public ModelAndView fileUploadAjaxForm() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("board/fileUpload_ajax");
		
		return mav;
	}*/
	
	@RequestMapping("/update")
	public Object update(String shopPhotoUrl, String email, String licenseeNo, String shopName, String shopAddr,
			String shopTel, String shopIntro, HttpSession session) throws Exception {
		
		ShopInfo shopInfo = new ShopInfo();
		shopInfo.setShopPhotoUrl("/"+ shopPhotoUrl);
		System.out.println("update에 shopPhotoUrl" + shopPhotoUrl);
		shopInfo.setEmail(email);
		shopInfo.setLicenseeNo(licenseeNo);
		shopInfo.setShopName(shopName);
		shopInfo.setShopAddr(shopAddr);
		shopInfo.setShopTel(shopTel);
		shopInfo.setShopIntro(shopIntro);
		
		shopInfoService.updateShopInfo(shopInfo);
		
		HashMap<String, Object> resultMap = new HashMap<>();

		session.setAttribute("updateShopInfo", shopInfo);
		resultMap.put("status", "success");
		resultMap.put("updateShopInfo", shopInfo);
		return resultMap;
	}
	
	@RequestMapping("/list")
	public Object list(String email, HttpSession session) throws Exception {
		
		HashMap<String, Object> resultMap = new HashMap<>();
		
		System.out.println(email);
		System.out.println(session.getServletContext().getRealPath("/fileupload/"));
		
		resultMap.put("listShopInfo", shopInfoService.getList(email));
		return resultMap;
	}
	
	
	/*@RequestMapping(value="/fileUploadAjax", method=RequestMethod.POST)
	  public Object fileUploadAjax(ShopInfo shopInfo) throws Exception {  
	    
	    if (shopInfo.getPhotofile() != null
	        && !shopInfo.getPhotofile().isEmpty()) {

	      String fileuploadRealPath = 
	        servletContext.getRealPath("/fileupload");
	      String filename = System.currentTimeMillis() + "_"; 
	      File file = new File(fileuploadRealPath + "/" + filename);
	    
	      shopInfo.getPhotofile().transferTo(file);
	      shopInfo.setPhoto(filename);
	    }
	    
	    shopInfoService.insertPhoto(shopInfo);
	    
	    HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
	    
	    return resultMap;
	  }*/
	
}
