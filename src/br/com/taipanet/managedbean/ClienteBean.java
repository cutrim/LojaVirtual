package br.com.taipanet.managedbean;

import java.util.Calendar;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.taipanet.model.Cliente;
import br.com.taipanet.model.Contato;
import br.com.taipanet.model.Endereco;
import br.com.taipanet.model.SexoEnum;
import br.com.taipanet.repository.DaoRepository;

@ManagedBean
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

	public String cadastrar(){
		this.cliente.setDataCadastro(Calendar.getInstance());
		this.cliente.setDataUltimaAlteracao(Calendar.getInstance());
		this.cliente.setEndereco(this.getEndereco());
		this.cliente.setContatos(this.getContatos());
		for (Contato contato : this.getContatos()) {
			new DaoRepository().adiciona(contato);
		}
		new DaoRepository().adiciona(this.cliente);
		
		this.setContatos(null);
		this.setEndereco(null);
		this.cliente=null;
		
		FacesContext context = FacesContext.getCurrentInstance();        
        context.addMessage(null, new FacesMessage("Sucesso",  "Cliente cadastrado com sucesso: " + message) );        
		return "/listarClientes";
	}
}
