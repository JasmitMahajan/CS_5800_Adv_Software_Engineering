import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Customer;
import entities.Professor;

public class MainCreate 
{
	public static void main(String[] args)
	{
		SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml")
                .addAnnotatedClass(Customer.class)
                .addAnnotatedClass(Professor.class)
                .buildSessionFactory();
		
		Session s =factory.getCurrentSession();
		createCustomer("jasmit","1234 DarthVader Blvd, San Jose, CA, 95014","Building 4 Room 10","Computer Science", factory);
		
	}
	public static void createCustomer(String name, String address, String office, String research, SessionFactory factory)
	{
		Session s=factory.getCurrentSession();
		s.beginTransaction();
		Customer c=new Customer(name, address); 
		s.save(c);	
		s.getTransaction().commit();
		
		s=factory.getCurrentSession();
		s.beginTransaction();
		Professor professor=new Professor(office,research,c.getId());
		s.save(professor);
		s.getTransaction().commit();
		
	}
}
