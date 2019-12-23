package njwc.oms.controller;

import java.util.List;

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
	
	//用户登录
	@RequestMapping("login0.do")
	@ResponseBody
	public UserVO login0(String account, String password,HttpSession session)
	{
		UserVO uservo=iService.login0(account, password);
		session.setAttribute("user", uservo.getUser());
		return uservo;
	}
	
	//显示所有商品
	@RequestMapping("queryProducts.do")
	@ResponseBody
	public List<Object> queryProducts()
	{
		return iService.queryProducts();
	}
	
	//创建订单
	@RequestMapping("createOrder.do")
	@ResponseBody
	public boolean createOrder(Integer product_id,float product_price,Integer produce_num,HttpSession session)
	{
		Integer user_id=(Integer)session.getAttribute("user");
		return iService.createOrder(user_id, product_id, product_price, produce_num);
	}

	//查询我的所有订单
	@RequestMapping("queryMyOrders.do")
	@ResponseBody
	public List<Object> queryMyOrders(HttpSession session)
	{
		Integer user_id=(Integer)session.getAttribute("user");
		return iService.queryMyOrders(user_id);
	}
	
	//更新订单状态
	@RequestMapping("changeOrderStatus.do")
	@ResponseBody
	public boolean changeOrderStatus(String order_number,Integer status)
	{
		return iService.changeOrderStatus(order_number, status);
	}
	
	//删除订单
	@RequestMapping("deleteOrder.do")
	@ResponseBody
	public boolean deleteOrder(String order_number)
	{
		return iService.deleteOrder(order_number);
	}
	
	
}
