package beautychu.control.json;

import java.io.File;
import java.util.HashMap;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import beautychu.domain.Style;
import beautychu.service.StylePhotoService;
import beautychu.service.StyleService;

@Controller("json.StyleControl")
@RequestMapping("/json/style")
public class StyleControl {
//	static Logger log = Logger.getLogger(ProductControl.class);

	@Autowired StyleService styleServie;
	@Autowired StylePhotoService stylePhotoService;
	@Autowired ServletContext servletContext;

	@RequestMapping("/list")
	public Object list() throws Exception {

		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("styleList", styleServie.getList());
		return resultMap;
	}
	
	@RequestMapping("/detail")
	public Object detail() throws Exception {

		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("styleDetail", styleServie.getStyleDetail());
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
	    
	    styleServie.add(style);
	    
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
