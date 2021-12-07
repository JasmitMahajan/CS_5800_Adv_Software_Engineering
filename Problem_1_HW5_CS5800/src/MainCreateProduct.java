import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Customer;
import entities.Product;

public class MainCreateProduct 
{
	public static void main(String[] args)
	{
		SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml")
                .addAnnotatedClass(Customer.class)
                .addAnnotatedClass(Product.class)                
                .buildSessionFactory();
		Session s=factory.getCurrentSession();
		
		Product p=new Product("Orange");
		s.save(p);
		s.getTransaction().commit();
	}
}
