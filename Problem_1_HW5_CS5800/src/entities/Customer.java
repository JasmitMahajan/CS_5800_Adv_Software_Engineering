package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="customer_id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="address")
	private String address;
	
	public Customer(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public Customer() {}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	
	
}
