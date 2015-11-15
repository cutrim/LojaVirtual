package br.com.taipanet.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Restrictions;

import br.com.taipanet.model.Produto;
import br.com.taipanet.model.Usuario;

public class ProdutoRepository extends DaoRepository{
	public ProdutoRepository() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Produto> listarProdutosComEstoque(){
		//Criteria criteria = DaoRepository.getSess().createCriteria(Produto.class, "produto");
		//criteria.createAlias("id", "id");
		//criteria.setProjection(Projections.)
		return null;
	}
}
