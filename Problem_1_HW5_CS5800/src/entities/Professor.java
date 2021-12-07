package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="professor")
public class Professor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="professor_id")
	private int id;
	
	@Column(name="office_number")
	private String officeNumber;
	
	@Column(name="research_area")
	private String researchArea;
	
	@Column(name="customer_id")
	private int customerId;
	
	public Professor(String officeNumber, String researchArea, int customerId) {
		this.officeNumber = officeNumber;
		this.researchArea = researchArea;
		this.customerId = customerId;
	}
	
	public Professor() {}

	public int getId() {
		return id;
	}

	public int getCustomerID()
	{
		return customerId;
	}
	
	public String getResearchArea()
	{
		return researchArea; 
	}
	
	public String getOfficeNumber()
	{
		return officeNumber;
	}

}
