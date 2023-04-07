package company.aria.care.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import company.aria.common.base.BaseController;

@Controller("careController")
@RequestMapping(value="/care")
public class CareControllerImpl extends BaseController implements CareController{
	
	@Override
	@RequestMapping(value= "/care-main.do" ,method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView main(HttpServletRequest request, HttpServletResponse response) throws Exception{
		HttpSession session;
		ModelAndView mav=new ModelAndView();
		String viewName=(String)request.getAttribute("viewName");
		mav.setViewName(viewName);
		
		/*
		 * session=request.getSession(); session.setAttribute("side_menu", "user");
		 * Map<String,List<GoodsVO>> goodsMap=goodsService.listGoods();
		 * mav.addObject("goodsMap", goodsMap);
		 */
		return mav;
	}
}