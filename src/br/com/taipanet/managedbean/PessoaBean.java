package br.com.taipanet.managedbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import br.com.taipanet.model.Contato;
import br.com.taipanet.model.Endereco;
import br.com.taipanet.model.Pessoa;
import br.com.taipanet.model.TipoContato;
import br.com.taipanet.model.TipoLogradouro;
import br.com.taipanet.repository.DaoRepository;

@ManagedBean @ViewScoped
public class PessoaBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Pessoa pessoa;
	private Contato contato = new Contato();
	private Endereco endereco = new Endereco();
	private List<Contato> contatos = new ArrayList<Contato>();
	
	public PessoaBean() {
		// TODO Auto-generated constructor stub
	}
	
	@SuppressWarnings("unchecked")
	public List<Pessoa> getPessoas(){
		return new DaoRepository().listar(Pessoa.class);
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

	@SuppressWarnings("unchecked")
	public List<TipoLogradouro> getTiposEndereco(){
		return new DaoRepository().listar(TipoLogradouro.class);
	}
	
	@SuppressWarnings("unchecked")
	public List<TipoContato> getTiposContato(){
		return new DaoRepository().listar(TipoContato.class);
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String cadastrar(Pessoa pessoa) {
		// TODO Auto-generated method stub
		new DaoRepository().adiciona(pessoa);
		return "/listar" + pessoa.getClass().getCanonicalName() + "s.jsf";
	}
	
	public void adicionarContato(){
		this.contatos.add(this.contato);
		this.contato = new Contato();		
		System.out.println("Quantidade de contatos: " + this.contatos.size());
	}
}
