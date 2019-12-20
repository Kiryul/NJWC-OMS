package njwc.oms.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import njwc.oms.service.IService;
import njwc.oms.vo.UserVO;

@Controller
public class UserController {
	@Resource
	private IService iService=null;
	
	//ÓÃ»§µÇÂ¼
	@RequestMapping("login0.do")
	@ResponseBody
	public UserVO login0(String account, String password,HttpSession session)
	{
		UserVO uservo=iService.login0(account, password);
		session.setAttribute("user", uservo.getUser());
		return uservo;
	}

}
