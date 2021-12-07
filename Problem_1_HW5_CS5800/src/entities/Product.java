package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="product_id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	public Product(String name) {
		this.name = name;
	}
	
	public Product() {}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
