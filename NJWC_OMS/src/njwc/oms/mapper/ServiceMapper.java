package njwc.oms.mapper;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;

import njwc.oms.po.T_entry;
import njwc.oms.po.T_order;
import njwc.oms.po.T_product;
import njwc.oms.po.T_seller;
import njwc.oms.po.T_user;

@Resource
public interface ServiceMapper {
	
	// 用户登录
	public abstract T_user login0(T_user user);
	
	// 商户登录
	public abstract T_seller login1(T_seller seller);
	
	//查询所有商品
	public abstract List<Object> queryProducts();
	
	//插入新订单
	public abstract boolean insertOrder(T_order order);
	
	//插入条目
	public abstract boolean insertEntry(T_entry entry);
	
	//查询我的订单
	public abstract List<Object> queryMyOrders(Integer user_id);
	
	//改变订单状态
	public abstract boolean changeOrderStatus(@Param("order_number")String order_number, @Param("status")Integer status);
	
	//删除订单
	public abstract boolean deleteOrder(String order_number);
	
	
	
	//查询商家发布的商品
	public abstract List<Object> queryMyProducts(Integer seller_id);
	
	//删除商品
	public abstract boolean deleteProducts(Integer product_id);
	
	//插入商品
    public abstract boolean insertProduct(T_product product);
    
    //更新商品信息
    public abstract boolean updateProduct(@Param("product_id")Integer product_id,@Param("name")String name,@Param("price")double price);
    
    //根据商品id查卖出的条目
	public abstract List<Object> queryMyEntry(Integer product_id);
	//根据商家查询商品id
	public abstract List<Integer> queryProduct_id(Integer seller_id);

}
