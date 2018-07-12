package org.o7planning.simplewebapp.beans;

public class Order {
	private String order_id;
	private String user_id;
	private String createdate;
	private int deliver_status;
	private String deliver_date;
	private String total_price;
	private int pay_status;
	public Order(String order_id, String user_id, String createdate,
			int deliver_status, String deliver_date, String total_price,
			int pay_status) {
		
		this.order_id = order_id;
		this.user_id = user_id;
		this.createdate = createdate;
		this.deliver_status = deliver_status;
		this.deliver_date = deliver_date;
		this.total_price = total_price;
		this.pay_status = pay_status;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	public int getDeliver_status() {
		return deliver_status;
	}
	public void setDeliver_status(int deliver_status) {
		this.deliver_status = deliver_status;
	}
	public String getDeliver_date() {
		return deliver_date;
	}
	public void setDeliver_date(String deliver_date) {
		this.deliver_date = deliver_date;
	}
	public String getTotal_price() {
		return total_price;
	}
	public void setTotal_price(String total_price) {
		this.total_price = total_price;
	}
	public int getPay_status() {
		return pay_status;
	}
	public void setPay_status(int pay_status) {
		this.pay_status = pay_status;
	}
	
	

}
