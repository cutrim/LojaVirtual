package br.com.taipanet.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.Criteria;


public class DaoRepository {
	private static Session sess;
	
	public DaoRepository() {
		// TODO Auto-generated constructor stub
	}
	
	public void adiciona(Object object){
		DaoRepository.getSess().getTransaction().begin();
		DaoRepository.getSess().persist(object);
		DaoRepository.getSess().getTransaction().commit();
		System.out.println("Objeto gravado com sucesso: " + object.getClass().getCanonicalName());
	}
	
	public <T> Object busca(long id, Class<T> classe){
		return this.getManager().find(classe, id);
	}
	
	@SuppressWarnings("rawtypes")
	public List listar(Class classe){
		Criteria criteria = DaoRepository.getSess().createCriteria(classe);
		return criteria.list();
	}

	public EntityManager getManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("LojaVirtual");
		return factory.createEntityManager();
	}

	public static Session getSess() {
		return sess;
	}

	public static void setSess(Session sess) {
		DaoRepository.sess = sess;
	}
	
}
