package njwc.oms.service;

import javax.annotation.Resource;

import njwc.oms.vo.SellerVO;
import njwc.oms.vo.UserVO;

@Resource
public interface IService {
	
	//�û���¼
	public abstract UserVO login0(String account,String password);
	
	//�̻���¼
	public abstract SellerVO login1(String account,String password);

}
