package njwc.oms.mapper;

import javax.annotation.Resource;

import njwc.oms.po.T_seller;
import njwc.oms.po.T_user;

@Resource
public interface ServiceMapper {
	
	// 用户登录
	public abstract T_user login0(T_user user);
	
	// 商户登录
	public abstract T_seller login1(T_seller seller);

}
