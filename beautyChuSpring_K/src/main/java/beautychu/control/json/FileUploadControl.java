package beautychu.control.json;

import java.io.File;
import java.util.HashMap;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import beautychu.domain.ShopInfo;
import beautychu.service.FileUploadService;

@Controller("json.FileUploadControl")
@RequestMapping("/json")
public class FileUploadControl {
	
	@Autowired
	private FileUploadService fileUploadService;
	
	@Autowired
	private ServletContext servletContext;
	

	/*@RequestMapping(value="/fileUpload", method=RequestMethod.GET)
	public ModelAndView fileUploadForm() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("board/fileUpload_submit");
		
		return mav;
	}*/
	
	/*  스프링방식
	@RequestMapping(value="/fileUpload", method=RequestMethod.POST)
	public ModelAndView fileUpload(MultipartHttpServletRequest mRequest) {
		
		ModelAndView mav = new ModelAndView();
		
		if(fileUploadService.fileUpload(mRequest)) {
			mav.addObject("result", "SUCCESS");
		} else {
			mav.addObject("result", "FAIL");
		}
		
		mav.setViewName("board/fileUpload_result");
		
		return mav;
	}*/
	
	/* ajax get방식
	@RequestMapping(value="/fileUploadAjax", method=RequestMethod.GET)
	public ModelAndView fileUploadAjaxForm() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("board/fileUpload_ajax");
		
		return mav;
	}*/
	
	/*AJAX post방식
	@RequestMapping(value="/fileUploadAjax", method=RequestMethod.POST)
	public ModelAndView fileUploadAjax(MultipartHttpServletRequest mRequest) {
		
		ModelAndView mav = new ModelAndView();
		
		if(fileUploadService.fileUpload(mRequest)) {
			mav.addObject("result", "SUCCESS");
		} else {
			mav.addObject("result", "FAIL");
		}
		
		mav.setViewName("JSON");
		
		return mav;
	}*/
	
	@RequestMapping(value="/fileUploadAjax", method=RequestMethod.POST)
	  public Object add(ShopInfo shopInfo) throws Exception {  
	    
	    if (shopInfo.getPhotofile() != null
	        && !shopInfo.getPhotofile().isEmpty()) {

	      String fileuploadRealPath = 
	        servletContext.getRealPath("/fileupload");
	      String filename = System.currentTimeMillis() + "_"; 
	      File file = new File(fileuploadRealPath + "/" + filename);
	    
	      shopInfo.getPhotofile().transferTo(file);
	      shopInfo.setPhoto(filename);
	    }
	    
	    fileUploadService.add(shopInfo);
	    
	    HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
	    
	    return resultMap;
	  }
	
	
}





