import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Customer;
import entities.Order;

public class MainDeleteOrder 
{
	public static void main(String[] args)
	{
		SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml")
                .addAnnotatedClass(Customer.class)
                .addAnnotatedClass(Order.class)                
                .buildSessionFactory();
		Session s=factory.getCurrentSession();
		s.beginTransaction();
		
		Order order=s.get(Order.class,1);
		s.remove(order);
		s.getTransaction().commit();
	}
}