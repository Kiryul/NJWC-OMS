package njwc.oms.vo;

import njwc.oms.po.T_user;

public class UserVO {
	private T_user user;
	private String message;
	
	public T_user getUser() {
		return user;
	}
	public void setUser(T_user user) {
		this.user = user;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "UserVO [user=" + user + ", message=" + message + "]";
	}
	
	

}
