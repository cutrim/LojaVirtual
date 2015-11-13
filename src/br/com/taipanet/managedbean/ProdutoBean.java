package br.com.taipanet.managedbean;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import br.com.taipanet.model.Produto;
import br.com.taipanet.repository.DaoRepository;

@ManagedBean
public class ProdutoBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Produto produto;
	
	public ProdutoBean() {
		// TODO Auto-generated constructor stub
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public String adicionar(){
		new DaoRepository().adiciona(produto);
		this.produto = new Produto();
		    
		return "listarProdutos";
	}
	
	@SuppressWarnings("unchecked")
	public List<Produto> getProdutos(){
		return new DaoRepository().listar(Produto.class);
	}
}
