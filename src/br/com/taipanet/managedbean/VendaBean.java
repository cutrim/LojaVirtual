package br.com.taipanet.managedbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.taipanet.model.Cliente;
import br.com.taipanet.model.FormaPagamento;
import br.com.taipanet.model.ItemProduto;
import br.com.taipanet.model.Pessoa;
import br.com.taipanet.model.Usuario;
import br.com.taipanet.model.Venda;
import br.com.taipanet.repository.DaoRepository;

@ManagedBean
public class VendaBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private Venda venda = new Venda();
	private Pessoa cliente = new Cliente();
	private Pessoa vendedor = new Usuario();
	private FormaPagamento formaPagamento = new FormaPagamento();
	private List<ItemProduto> produtos = new ArrayList<ItemProduto>();
	
	public VendaBean() {
		// TODO Auto-generated constructor stub
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String adicionar(){
		this.venda.setData(Calendar.getInstance());
		new DaoRepository().adiciona(this.venda);
		this.venda = new Venda();
		return "listarVendas.jsf";
	}
	
	@SuppressWarnings("unchecked")
	public List<Venda> getVendas(){
		return new DaoRepository().listar(Venda.class);
	}

	public Pessoa getCliente() {
		return cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}

	public Pessoa getVendedor() {
		return vendedor;
	}

	public void setVendedor(Pessoa vendedor) {
		this.vendedor = vendedor;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public List<ItemProduto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<ItemProduto> produtos) {
		this.produtos = produtos;
	}
	
	
}
