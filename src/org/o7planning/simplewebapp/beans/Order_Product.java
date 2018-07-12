package org.o7planning.simplewebapp.beans;

public class Order_Product {
	private String order_id;
	private String product_code;
	private float price;
	private int quantity;
	public Order_Product(String order_id, String product_code, float price,
			int quantity) {
		super();
		this.order_id = order_id;
		this.product_code = product_code;
		this.price = price;
		this.quantity = quantity;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getProduct_code() {
		return product_code;
	}
	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
