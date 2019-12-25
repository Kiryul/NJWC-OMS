package njwc.oms.po;

public class T_product {
	private int id;
	private int product_id;
	private String name;
	private int type;
	private double price;
	private int seller_id;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getSeller_id() {
		return seller_id;
	}
	public void setSeller_id(int seller_id) {
		this.seller_id = seller_id;
	}
	@Override
	public String toString() {
		return "T_product [id=" + id + ", product_id=" + product_id + ", name=" + name + ", type=" + type + ", price="
				+ price + ", seller_id=" + seller_id + "]";
	}

	
	
	
}
