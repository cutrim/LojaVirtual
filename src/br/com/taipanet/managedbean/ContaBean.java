package br.com.taipanet.managedbean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.taipanet.model.Conta;
import br.com.taipanet.repository.DaoRepository;

@ManagedBean
public class ContaBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Conta conta = new Conta();
	
	public ContaBean() {
		// TODO Auto-generated constructor stub
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@SuppressWarnings("unchecked")
	public List<Conta> getContas(){
		return new DaoRepository().listar(Conta.class);
	}

	public String cadastrar(){
		new DaoRepository().adiciona(this.conta);
		this.conta = new Conta();
		return "listarContas";
	}
}
