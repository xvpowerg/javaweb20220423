package tw.com.cdi;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class EmProduces {
	//�NEntityManager��ҥ浹�e���޲z 
	//����]�浹�e���޲z
	@PersistenceContext
	@Produces
	private EntityManager em;
	
}
