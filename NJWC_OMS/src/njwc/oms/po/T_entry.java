package njwc.oms.po;

public class T_entry {
	private int id;
	private int product_id;
	private double product_price;
	private int product_num;
	private String order_number;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public double getProduct_price() {
		return product_price;
	}
	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}
	public int getProduct_num() {
		return product_num;
	}
	public void setProduct_num(int product_num) {
		this.product_num = product_num;
	}
	public String getOrder_number() {
		return order_number;
	}
	public void setOrder_number(String order_number) {
		this.order_number = order_number;
	}
	@Override
	public String toString() {
		return "T_entry [id=" + id + ", product_id=" + product_id + ", product_price=" + product_price
				+ ", product_num=" + product_num + ", order_number=" + order_number + "]";
	}
	
	

}
