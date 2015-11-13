package br.com.taipanet.managedbean;

import java.util.Calendar;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.taipanet.model.ItemProduto;
import br.com.taipanet.model.Produto;
import br.com.taipanet.repository.DaoRepository;

@ManagedBean @SessionScoped
public class CompraBean{
	Produto produto = new Produto();
	String message = "";
	ItemProduto itemProduto = new ItemProduto();
	int quantidade = 0;
	
	public CompraBean() {
		// TODO Auto-generated constructor stub
	}

	public Produto getProduto() {
		return produto;
	}
	
	public String selecionaProduto (Produto produto){
		this.produto = produto;
		return "formComprarItens.jsf";
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public String cadastrar(){
		
		this.itemProduto.setDataCadastro(Calendar.getInstance());
		this.itemProduto.setProduto(this.produto);
		/* pegar a data correta */
		this.itemProduto.setDataCompra(Calendar.getInstance());
		ItemProduto itemGravado = null;	
		for (int i = 0; i<this.quantidade; i++){
			this.itemProduto.setCodigoSerie("X" + i);
			itemGravado = new ItemProduto();
			itemGravado.setCodigoSerie(this.itemProduto.getCodigoSerie());
			itemGravado.setDataCadastro(this.itemProduto.getDataCadastro());
			itemGravado.setDataCompra(this.itemProduto.getDataCompra());
			itemGravado.setProduto(this.itemProduto.getProduto());
			itemGravado.setFornecedor(this.itemProduto.getFornecedor());
			itemGravado.setValorCompra(this.itemProduto.getValorCompra());
			new DaoRepository().adiciona(itemGravado);
		}
		
		this.itemProduto=null;
		this.produto=null;
		
		FacesContext context = FacesContext.getCurrentInstance();        
        context.addMessage(null, new FacesMessage("Sucesso",  "Produto cadastrado com sucesso: " + message) );        
		return "/listarProdutosCompra.jsf";
	}
	
	@SuppressWarnings("unchecked")
	public List<Produto> getProdutos(){
		return new DaoRepository().listar(Produto.class);
	}

	public ItemProduto getItemProduto() {
		return itemProduto;
	}

	public void setItemProduto(ItemProduto itemProduto) {
		this.itemProduto = itemProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}