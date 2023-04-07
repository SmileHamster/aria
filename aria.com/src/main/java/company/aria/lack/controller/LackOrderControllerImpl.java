package company.aria.lack.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import company.aria.common.base.BaseController;
import company.aria.lack.service.LackOrderServiceImpl;
import company.aria.lack.vo.LaOrderVO;
import company.aria.member.vo.MemberVO;

@Controller("lackorderController")
@RequestMapping(value="/lackorder")
@EnableAsync
public class LackOrderControllerImpl extends BaseController {
	@Autowired
	LaOrderVO laorderVO;
	
	@Autowired
	LackOrderServiceImpl lackorderService;
	
	
	@RequestMapping(value="/addOrder.do" ,method = RequestMethod.POST)
	public ModelAndView addCart(@ModelAttribute LaOrderVO laorderVO,HttpServletRequest request, HttpServletResponse response) throws Exception {
		int lm_id = Integer.parseInt(request.getParameter("lm_id"));
		int lc_qty = Integer.parseInt(request.getParameter("lc_qty"));
		HttpSession session=request.getSession();
		String login_id=(String)session.getAttribute("login_id");
		HashMap map = new HashMap();
		map.put("lm_id", lm_id);
		map.put("lc_qty", lc_qty);
		map.put("login_id", login_id);
		int result = 0;
		//result = lackcartService.addcart(map);		
		ModelAndView mav = new ModelAndView("redirect:/lackmenu/la-menu.do");
		return mav;
	}
	
}
