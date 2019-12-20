package njwc.oms.service;

import javax.annotation.Resource;

import njwc.oms.vo.SellerVO;
import njwc.oms.vo.UserVO;

@Resource
public interface IService {
	
	//用户登录
	public abstract UserVO login0(String account,String password);
	
	//商户登录
	public abstract SellerVO login1(String account,String password);

}
