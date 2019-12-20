package njwc.oms.po;

import java.sql.Timestamp;

public class T_order {
	private int id;
	private String order_number;
	private Timestamp create_time;
	private int status;
	private int user_id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrder_number() {
		return order_number;
	}
	public void setOrder_number(String order_number) {
		this.order_number = order_number;
	}
	public Timestamp getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", order_number=" + order_number + ", create_time=" + create_time + ", status="
				+ status + ", user_id=" + user_id + "]";
	}
	
	
	

}
