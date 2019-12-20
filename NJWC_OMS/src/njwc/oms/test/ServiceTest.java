package njwc.oms.test;

import javax.annotation.Resource;

import org.junit.Test;

import njwc.oms.mapper.ServiceMapper;
import njwc.oms.po.T_user;


public class ServiceTest extends BaseTest
{
	@Resource
	private ServiceMapper serviceMapper;
	
	@Test
	public void mapperLogin0() throws Exception
	{
		T_user user=new T_user();
		user.setAccount("a001");
		user.setPassword("123");
		System.out.println(user.toString());
		user=serviceMapper.login0(user);
		System.out.println(user.toString());
	}

}
