package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.TransactionEntity;


/**
 * Session Bean implementation class transactionEJB
 */
@Stateless
@LocalBean
public class TransactionEJB {
 
	@PersistenceContext(name="bankpu")
	private EntityManager em;
	
    public TransactionEJB() {
        // TODO Auto-generated constructor stub
    }

    public void addNewTransaction(TransactionEntity transactionEntity) {
		System.out.println("=====Adding transactions=========");
		em.persist(transactionEntity);
	}
}
