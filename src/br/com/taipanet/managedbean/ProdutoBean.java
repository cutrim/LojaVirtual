package br.com.taipanet.managedbean;

import java.util.Calendar;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.taipanet.model.Produto;
import br.com.taipanet.repository.DaoRepository;

@ManagedBean
public class ProdutoBean{
	Produto produto = new Produto();
	String message = "";
	
	public ProdutoBean() {
		// TODO Auto-generated constructor stub
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public String cadastrar(){
		
		this.produto.setDataCadastro(Calendar.getInstance());
		this.produto.setDataUltimaAlteracao(Calendar.getInstance());
		
		new DaoRepository().adiciona(this.produto);
		
		this.produto=null;
		
		FacesContext context = FacesContext.getCurrentInstance();        
        context.addMessage(null, new FacesMessage("Sucesso",  "Produto cadastrado com sucesso: " + message) );        
		return "/listarProdutos.jsf";
	}
	
	@SuppressWarnings("unchecked")
	public List<Produto> getProdutos(){
		return new DaoRepository().listar(Produto.class);
	}
}
