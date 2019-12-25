package njwc.oms.vo;

import java.util.List;

import njwc.oms.po.T_entry;
import njwc.oms.po.T_order;

public class OrderVO {
	private T_order order;
	private List<Object> entry;
	public T_order getOrder() {
		return order;
	}
	public void setOrder(T_order order) {
		this.order = order;
	}
	public List<Object> getEntry() {
		return entry;
	}
	public void setEntry(List<Object> entry2) {
		this.entry = entry2;
	}
	@Override
	public String toString() {
		return "OrderVO [order=" + order + ", entry=" + entry + "]";
	}
	
	

}
