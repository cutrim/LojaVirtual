package br.com.taipanet.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.Criteria;


public class DaoRepository {
	
	public DaoRepository() {
		// TODO Auto-generated constructor stub
	}
	
	public void adiciona(Object object){
		this.getManager().getTransaction().begin();
		this.getManager().persist(object);
		this.getManager().getTransaction().commit();
		System.out.println("Objeto gravado com sucesso: " + object.getClass().getCanonicalName());
	}
	
	public <T> Object busca(long id, Class<T> classe){
		return this.getManager().find(classe, id);
	}
	
	@SuppressWarnings("rawtypes")
	public List listar(Class classe){
		Session sess = (Session) this.getManager().getDelegate();
		Criteria criteria = sess.createCriteria(classe);
		return criteria.list();
	}

	public EntityManager getManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("LojaVirtual");
		return factory.createEntityManager();
	}
	
}
