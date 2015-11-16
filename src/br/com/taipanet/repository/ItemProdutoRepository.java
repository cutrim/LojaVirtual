package br.com.taipanet.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Restrictions;

import br.com.taipanet.model.ItemProduto;
import br.com.taipanet.model.Produto;
import br.com.taipanet.model.Usuario;

public class ItemProdutoRepository extends DaoRepository{
	public ItemProdutoRepository() {
		// TODO Auto-generated constructor stub
	}
	
	public int quantidadeEmEstoque(Produto produto){
		Criteria criteria = DaoRepository.getSess().createCriteria(ItemProduto.class)
				.add(Restrictions.eq("produto",produto));
		return criteria.list().size();
	}
}
