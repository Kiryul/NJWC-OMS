package njwc.oms.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import njwc.oms.vo.SellerVO;
import njwc.oms.vo.UserVO;

@Resource
public interface IService {
	
	//用户登录
	public abstract UserVO login0(String account,String password);
	
	//商户登录
	public abstract SellerVO login1(String account,String password);
	
	
	
	/*
	 * //查询所有商品
	 *
	 * 1.进入首页看见的商品
	 * 2.可以根据商品类型对商品分类显示
	 * 3.点击商品显示商品自身的信息
     */	
	public abstract List<Object> queryProducts();
	
	/**
	 *  //创建订单
	 *  //点击下单生成订单并且创建条目
	 * @param user_id,product_id,product_price,product_num
	 * @return boolean
	 */
	public abstract boolean createOrder(Integer user_id,Integer product_id,double product_price,Integer product_num);
	
	/*
	 * //查询我的所有订单
	 * 
	 * 1.点击“我的订单”显示的我的所有订单
	 * 2.根据订单状态给订单分类
	 * 3.点击一个订单显示订单详情
	 * 4.点击付款、确认收货改变订单状态
	 * 5.点击删除删除订单
	 */
	public abstract List<Object> queryMyOrders(Integer user_id,Integer status);
	
	//更新订单状态（0：未付款；1：已付款）
	public abstract boolean changeOrderStatus(String order_number,Integer status);
	
	//删除订单
	public abstract boolean deleteOrder(String order_number);
	
	
	
	//角色： 商户
	/**  
	 *  //查询我的所有产品
	 *  //商户登录首页显示该商户所发布的所有产品
	 * @param seller_id
	 * @return List<Object>
	 */
	public abstract List<Object> queryMyProducts(Integer seller_id);
	
	/**
	 *  //删除商品
	 * @param product_id
	 * @return boolean
	 */
	public abstract boolean deleteProducts(Integer product_id);
	
	/**
	 *  //插入商品
	 *  //商户发布新产品
	 * @param product_id
	 * @param name
	 * @param price
	 * @param seller_id
	 * @return
	 */
	public abstract boolean insertProduct(Integer product_id,String name,Integer type,double price,Integer seller_id);

	/**
	 *  //更改商品信息
	 * @param product_id
	 * @param name
	 * @param price
	 * @return
	 */
	public abstract boolean updateProduct(Integer product_id,String name,double price);
	
	/**
	 *  //查看我的卖出记录
	 * @param product_id
	 * @return
	 */
	public abstract Map<Object,Object> queryMyEntry(Integer seller_id);
}
