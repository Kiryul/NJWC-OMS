package njwc.oms.vo;

import njwc.oms.po.T_seller;

public class SellerVO {
	private T_seller seller;
	private String message;
	public T_seller getSeller() {
		return seller;
	}
	public void setSeller(T_seller seller) {
		this.seller = seller;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "SellerVO [seller=" + seller + ", message=" + message + "]";
	}
	
	

}
