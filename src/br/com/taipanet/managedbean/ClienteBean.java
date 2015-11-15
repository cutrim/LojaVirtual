package br.com.taipanet.managedbean;

import java.util.Calendar;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.taipanet.model.Cliente;
import br.com.taipanet.model.Contato;
import br.com.taipanet.model.Pessoa;
import br.com.taipanet.repository.DaoRepository;

@ManagedBean @SessionScoped
public class ClienteBean extends PessoaBean{
	Cliente cliente = new Cliente();
	String message = "";
	
	public ClienteBean() {
		// TODO Auto-generated constructor stub
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String cadastrar(){
		
		if (this.cliente.getId()==null)
			this.cliente.setDataCadastro(Calendar.getInstance());
		this.cliente.setDataUltimaAlteracao(Calendar.getInstance());
		this.cliente.setEndereco(this.getEndereco());
		this.cliente.setContatos(this.getContatos());
		for (Contato contato : this.getContatos()) {
			new DaoRepository().adiciona(contato);
		}
		new DaoRepository().adiciona(this.cliente);
		this.cliente=new Cliente();		
		return "listarClientes.jsf";
	}
	
	public String detalharCliente(Pessoa cliente){
		this.cliente =(Cliente) cliente; 
		super.setEndereco(cliente.getEndereco());
		super.setContatos(cliente.getContatos());
		System.out.println(this.cliente.getNomeRazao());
		return "formClientes.jsf";
	}
}
