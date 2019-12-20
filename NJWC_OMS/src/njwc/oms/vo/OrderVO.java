package njwc.oms.vo;

import java.util.List;

import njwc.oms.po.T_entry;
import njwc.oms.po.T_order;

public class OrderVO {
	private T_order order;
	private List<T_entry> entry;
	public T_order getOrder() {
		return order;
	}
	public void setOrder(T_order order) {
		this.order = order;
	}
	public List<T_entry> getEntry() {
		return entry;
	}
	public void setEntry(List<T_entry> entry) {
		this.entry = entry;
	}
	@Override
	public String toString() {
		return "OrderVO [order=" + order + ", entry=" + entry + "]";
	}
	
	

}
