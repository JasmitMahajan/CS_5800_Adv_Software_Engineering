import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Customer;
import entities.Product;

public class MainDeleteProduct 
{
	public static void main(String[] args)
	{
		SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml")
                .addAnnotatedClass(Customer.class)
                .addAnnotatedClass(Product.class)                
                .buildSessionFactory();
		Session s=factory.getCurrentSession();
		s.beginTransaction();
		
		Product product=s.get(Product.class,1);
		s.remove(product);
		s.getTransaction().commit();
	}
}