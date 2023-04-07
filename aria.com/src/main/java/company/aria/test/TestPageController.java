package company.aria.test;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import company.aria.common_api.service.Common_api_Service;
import company.aria.common_api.vo.Common_api_VO;

@RestController
@Controller("TestPageController")
public class TestPageController {
	@Autowired
	private TestPageService testpageservice;
	@Autowired
	private Common_api_VO common_api_vo;
	
/*
	@ResponseBody
	@RequestMapping(value="/testPage.do", method=RequestMethod.GET)
	public ResponseEntity testMain(HttpServletRequest request, HttpServletResponse response)throws Exception{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8;");
		ResponseEntity resEntity = null;
		String message = null;
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "text/html; charset=utf-8;");
		resEntity =new ResponseEntity(message, responseHeaders, HttpStatus.OK);
		return resEntity;
	}
*/
	@ResponseBody
	@RequestMapping(value="/test/*.do", method= {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView testMain(HttpServletRequest request, HttpServletResponse response)throws Exception{
		ModelAndView mav = new ModelAndView();
		String viewName = (String)request.getAttribute("viewName");
		
		if(viewName.equals("/test/testPage2")) {
			List<Common_api_VO> common_api_list = new ArrayList();
			common_api_list = testpageservice.getStoreList();
			
			//transform to json
			Gson gson = new Gson();
			String common_api_list_json = gson.toJson(common_api_list);
			
			System.out.println(common_api_list_json);
			
			mav.addObject("common_api_list_json", common_api_list_json);
		}
		
		mav.setViewName(viewName);
		return mav;
	}

}
