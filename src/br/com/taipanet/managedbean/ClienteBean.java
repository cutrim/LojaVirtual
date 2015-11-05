package br.com.taipanet.managedbean;

import java.util.Calendar;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.taipanet.model.Cliente;
import br.com.taipanet.model.Endereco;
import br.com.taipanet.model.SexoEnum;
import br.com.taipanet.repository.DaoRepository;

@ManagedBean
public class ClienteBean extends PessoaBean{
	Cliente cliente = new Cliente();
	Endereco endereco = new Endereco();
	
	public ClienteBean() {
		// TODO Auto-generated constructor stub
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String cadastrar(){
		this.cliente.setSexo(SexoEnum.M);
		this.cliente.setDataCadastro(Calendar.getInstance());
		this.cliente.setDataUltimaAlteracao(Calendar.getInstance());
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua x");
		this.cliente.setEndereco(endereco);
		new DaoRepository().adiciona(this.cliente);
		FacesMessage mensagem = new FacesMessage ("Cliente cadastrado com sucesso!");
		mensagem.setSeverity(FacesMessage.SEVERITY_INFO);
		return "/listarClientes";
	}
}
