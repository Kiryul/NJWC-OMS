package njwc.oms.mapper;

import javax.annotation.Resource;

import njwc.oms.po.T_seller;
import njwc.oms.po.T_user;

@Resource
public interface ServiceMapper {
	
	// �û���¼
	public abstract T_user login0(T_user user);
	
	// �̻���¼
	public abstract T_seller login1(T_seller seller);

}
