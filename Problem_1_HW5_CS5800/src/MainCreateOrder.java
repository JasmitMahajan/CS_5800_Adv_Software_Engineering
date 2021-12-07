import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Customer;
import entities.Order;

public class MainCreateOrder {
	public static void main(String[] args)
	{
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Customer.class)
                .addAnnotatedClass(Order.class)                
                .buildSessionFactory();
		Session s=factory.getCurrentSession();
		
		Customer c=s.get(Customer.class, 4);
		Date current=new Date();
		Order order=new Order(c.getName(),current);
		s.save(order);
		s.getTransaction().commit();
	}
}
