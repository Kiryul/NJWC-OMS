package njwc.oms.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import njwc.oms.po.T_user;
import njwc.oms.service.IService;
import njwc.oms.vo.SellerVO;
import njwc.oms.vo.UserVO;
import njwc.oms.mapper.*;

//@Repository
@Service
public class ServiceImpl implements IService
{
//	@Autowired
	@Resource
    private ServiceMapper  serviceMapper;

	@Override
	public UserVO login0(String account, String password) {
		// TODO Auto-generated method stub
		T_user user=new T_user();
		user.setAccount(account);
		user.setPassword(password);
		user=serviceMapper.login0(user);
		UserVO uservo=new UserVO();
		if(user==null)
		{
			uservo.setMessage("用户不存在！");
			uservo.setUser(null);
			return uservo;
		}
		if(password.equals(user.getPassword()))
		{
			uservo.setMessage("200");
			uservo.setUser(user);
			return uservo;
		}
		uservo.setMessage("密码错误！");
		return uservo;
	}

	@Override
	public SellerVO login1(String account, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
