package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="order_detail")
public class Order_Detail {
	
	@Column(name="order_id")
	private int id;
	
	@Column(name="product_id")
	private int productId;
	
	public Order_Detail(int orderId, int productId) {
		id = orderId;
		this.productId = productId;
	}
	
	public Order_Detail() {}

	public int getOrderId() {
		return id;
	}

	public int getProductId() {
		return productId;
	}
	
	
}
