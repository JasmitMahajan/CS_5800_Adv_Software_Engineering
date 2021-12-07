package entities;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="order_id")
	private int id;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="customer_name")
	private String name;
	
	public Order(String name, Date date) {
		this.name = name;
		this.date = date;
	}
	
	public Order() {}

	public int getOrderId() {
		return id;
	}

	public Date getDate() {
		return date;
	}

	public String getCustomerName() {
		return name;
	}
	
	

}