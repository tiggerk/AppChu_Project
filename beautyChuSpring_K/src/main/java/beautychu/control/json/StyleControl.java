package beautychu.control.json;

import java.io.File;
import java.util.HashMap;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import beautychu.domain.Member;
import beautychu.domain.Review;
import beautychu.domain.Style;
import beautychu.domain.StyleDetail;
import beautychu.domain.StyleGrid;
import beautychu.service.StylePhotoService;
import beautychu.service.StyleService;

@Controller("json.styleControl")
@RequestMapping("/json/style")
public class StyleControl {
//	static Logger log = Logger.getLogger(ProductControl.class);

	@Autowired StyleService styleService;
	@Autowired StylePhotoService stylePhotoService;
	@Autowired ServletContext servletContext;

	@RequestMapping("/list")
	public Object list(StyleGrid styleList) throws Exception {
		System.out.println(styleList);
		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("styleList", styleService.getList(styleList));
		return resultMap;
	}
	
	@RequestMapping("/detail")
	public Object detail(Review review,Model model,HttpSession session) throws Exception {
		
		Member member =  (Member) session.getAttribute("loginUser");
		if (session.getAttribute("loginUser") != null) {
			review.setEmail(member.getEmail());
		}
		StyleDetail styleDetail = styleService.get(review);
		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("styleDetail", styleDetail);
		resultMap.put("photos", styleDetail.getPhotoList());
		resultMap.put("email", styleDetail.getEmail());
		resultMap.put("review", styleDetail.getReview());
		System.out.println("리뷰===========>"+resultMap);
		return resultMap;
	}
	
	@RequestMapping("/mainStyleList")
	public Object mainStyleList() throws Exception {
		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("mainStyleList", styleService.getMainStyleList());
		return resultMap;
	}
	
	@RequestMapping("/mainCelebrityList")
	public Object mainCelebrityList() throws Exception {
		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("mainCelebrityList", styleService.getMainCelebrityList());
		return resultMap;
	}
	
	@RequestMapping("/photoList")
	public Object list(int no) throws Exception {
		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("stylePhotoList", stylePhotoService.getList(no));
		return resultMap;
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	  public Object add(Style style) throws Exception {  
	    if (style.getPhotofile() != null
	        && !style.getPhotofile().isEmpty()) {

	      String fileuploadRealPath = 
	        servletContext.getRealPath("/fileupload");
	      String filename = System.currentTimeMillis() + "_"; 
	      File file = new File(fileuploadRealPath + "/" + filename);
	    
	      style.getPhotofile().transferTo(file);
	      style.setStylePhotoUrl(filename);
	    }
	    
	    styleService.add(style);
	    
	    HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
	    
	    return resultMap;
	  }
	
	/*AJAX post방식*/
	@RequestMapping(value="/fileUpload", method=RequestMethod.POST)
	public ModelAndView fileUpload(MultipartHttpServletRequest mRequest, int styleNo) {
		
		System.out.println("나나나"+ styleNo);
		ModelAndView mav = new ModelAndView();
		
		if(stylePhotoService.fileUpload(mRequest, styleNo)) {
			mav.addObject("result", "SUCCESS");
		} else {
			mav.addObject("result", "FAIL");
		}
		
		mav.setViewName("JSON");
		
		return mav;
	}
	

}
