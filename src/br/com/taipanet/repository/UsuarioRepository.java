package br.com.taipanet.repository;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import br.com.taipanet.model.Usuario;

public class UsuarioRepository extends DaoRepository{
		
	public UsuarioRepository() {
		// TODO Auto-generated constructor stub
	}

	public Boolean autenticar(String login, String senha){
		Session sess = (Session) super.getManager().getDelegate();
		Criteria criteria = sess.createCriteria(Usuario.class);
		criteria.add(Restrictions.eq("login", login));
		criteria.add(Restrictions.eq("senha", senha));

		int size = criteria.list().size();
		if (size>0)	{return true;} else return false;		
	}
}
