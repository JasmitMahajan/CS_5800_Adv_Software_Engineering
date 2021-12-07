import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Customer;
import entities.Professor;

public class MainDelete
{
	public static void main(String[] args)
	{
		SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Customer.class).
                addAnnotatedClass(Professor.class).
                buildSessionFactory();

		Session s = factory.getCurrentSession();
		
			try {
			
			s.beginTransaction();
			
			Customer c = s.get(Customer.class, 1);
			CriteriaBuilder criteria=s.getCriteriaBuilder();
			CriteriaQuery<Professor> criteriaQuery=criteria.createQuery(Professor.class);
			Root<Professor> currProfessor=criteriaQuery.from(Professor.class);
			criteriaQuery.where(criteria.equal(currProfessor.get("customer_id"), c.getId()));
			List<Professor> result=s.createQuery(criteriaQuery).getResultList();
			Professor p=result.get(0);
			s.delete(p);
			s.delete(c);					
			s.getTransaction().commit();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			factory.close();
		}
	}
}