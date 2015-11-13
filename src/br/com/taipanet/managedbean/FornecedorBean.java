package br.com.taipanet.managedbean;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.taipanet.model.Contato;
import br.com.taipanet.model.Fornecedor;
import br.com.taipanet.model.Pessoa;
import br.com.taipanet.repository.DaoRepository;

@ManagedBean
public class FornecedorBean extends PessoaBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Fornecedor fornecedor = new Fornecedor();
	String message = "";
	
	public FornecedorBean() {
		// TODO Auto-generated constructor stub
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Pessoa> getPessoas() {
		// TODO Auto-generated method stub
		return new DaoRepository().listar(Fornecedor.class);
	}

	public String cadastrar(){
		this.fornecedor.setDataCadastro(Calendar.getInstance());
		this.fornecedor.setDataUltimaAlteracao(Calendar.getInstance());
		this.fornecedor.setEndereco(this.getEndereco());
		this.fornecedor.setContatos(this.getContatos());
		for (Contato contato : this.getContatos()) {
			new DaoRepository().adiciona(contato);
		}
		new DaoRepository().adiciona(this.fornecedor);		
		this.setContatos(null);
		this.setEndereco(null);
		this.fornecedor=null;     
		return "listarFornecedores";
	}
}
