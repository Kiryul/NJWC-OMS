package njwc.oms.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import njwc.oms.service.IService;
import njwc.oms.vo.SellerVO;

@Controller
public class SellerController {
	
	@Resource
	private IService iService=null;
	
	//商户登录
	@RequestMapping("login1.do")
	@ResponseBody
	public SellerVO login1(String account, String password,HttpSession session)
	{
		SellerVO sellervo=iService.login1(account, password);
		session.setAttribute("seller", sellervo.getSeller());
		return sellervo;
	}
	
	//查询我的所有产品
	@RequestMapping("queryMyProducts.do")
	@ResponseBody
	public List<Object> queryMyProducts(HttpSession session)
	{
		Integer seller_id=(Integer) session.getAttribute("seller");
		return iService.queryMyProducts(seller_id);
	}

	//删除商品
	@RequestMapping("deleteProducts.do")
	@ResponseBody
	public boolean deleteProducts(Integer product_id)
	{
		return iService.deleteProducts(product_id);
	}
	
	//发布新产品
	@RequestMapping("insertProduct.do")
	@ResponseBody
	public boolean insertProduct(Integer product_id,String name,float price,HttpSession session)
	{
		Integer seller_id=(Integer) session.getAttribute("seller");
		return iService.insertProduct(product_id, name, price, seller_id);
	}
	
	//更该商品信息
	@RequestMapping("updateProduct.do")
	@ResponseBody
	public boolean updateProduct(Integer product_id,String name,float price)
	{
		return iService.updateProduct(product_id, name, price);
	}
	
	//查看我的卖出记录
	@RequestMapping("queryMyEntry.do")
	@ResponseBody
	public Map<Object,Object> queryMyEntry(HttpSession session)
	{
		Integer seller_id=(Integer) session.getAttribute("seller");
		return iService.queryMyEntry(seller_id);
	}
}
