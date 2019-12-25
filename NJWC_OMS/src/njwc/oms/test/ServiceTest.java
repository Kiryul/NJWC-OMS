package njwc.oms.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import njwc.oms.mapper.ServiceMapper;
import njwc.oms.po.T_user;
import njwc.oms.service.IService;


public class ServiceTest extends BaseTest
{
	@Resource
	private ServiceMapper serviceMapper;
	@Resource
	private IService iService;
	
//	//登录测试
//	@Test
//	public void mapperLogin0() throws Exception
//	{
//		T_user user=new T_user();
//		user.setAccount("a001");
//		user.setPassword("123");
//		System.out.println(user.toString());
//		user=serviceMapper.login0(user);
//		System.out.println(user.toString());
//	}
	
	//查询所有商品
//	@Test
//	public void queryProducts() throws Exception
//	{
//		List<Object> object = iService.queryProducts();
//		System.out.println(object);
//	}
	
//	//创建订单
//	@Test
//	public void createOrder() throws Exception
//	{
//		Integer user_id=1;
//		Integer product_id=4;
//		double product_price=33;
//		Integer product_num=10;
//		System.out.println(iService.createOrder(user_id, product_id, product_price, product_num));
//	}

//	//查询我的所有订单
//	@Test
//	public void queryMyOrders() throws Exception
//	{
//		List<Object> object=iService.queryMyOrders(1);
//		System.out.println(object);
//	}

//	//更改订单状态
//	@Test
//	public void changeOrderStatus() throws Exception
//	{
//		String order_number="45559ce2aa5b43ebbebbc63fe32521ff";
//		Integer status=1;
//		System.out.println(iService.changeOrderStatus(order_number, status));
//	}
	
//	//删除订单
//	@Test
//	public void deleteOrder() throws Exception
//	{
//		String order_number="ad3bf8ccca274e41913527896fbbe2c8";
//		System.out.println(iService.deleteOrder(order_number));
//	}
	
//	//查询我的所有产品
//	@Test
//	public void queryMyProducts() throws Exception
//	{
//		System.out.println(iService.queryMyProducts(1));
//	}
	
//	//插入商品
//	@Test
//	public void insertProduct() throws Exception
//	{
//		System.out.println(iService.insertProduct(003, "桂花糕", 12.8, 1));
//	}
	
//	//修改商品
//	@Test
//	public void updateProduct() throws Exception
//	{
//		System.out.println(iService.updateProduct(3, "绿豆糕", 14.5));
//	}
	
//	//删除商品
//	@Test
//	public void deleteProducts() throws Exception
//	{
//		System.out.println(iService.deleteProducts(3));
//	}
	
//	//查看我的卖出记录
//	@Test
//	public void queryMyEntry() throws Exception
//	{
//		System.out.println(iService.queryMyEntry(1));
//	}
}
