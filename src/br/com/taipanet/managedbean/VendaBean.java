package br.com.taipanet.managedbean;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.taipanet.model.Produto;
import br.com.taipanet.model.Venda;
import br.com.taipanet.repository.DaoRepository;

@ManagedBean
public class VendaBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private Venda venda = new Venda();
	
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
	public List<Produto> getProdutos(){
		return new DaoRepository().listar(Venda.class);
	}
}
