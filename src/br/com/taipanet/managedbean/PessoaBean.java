package br.com.taipanet.managedbean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.taipanet.model.Pessoa;
import br.com.taipanet.repository.DaoRepository;

@ManagedBean
public class PessoaBean {
	Pessoa pessoa;
	
	public PessoaBean() {
		// TODO Auto-generated constructor stub
	}
	
	@SuppressWarnings("unchecked")
	public List<Pessoa> getPessoas(){
		return new DaoRepository().listar(Pessoa.class);
	}
	
	public String cadastrar(Pessoa pessoa) {
		// TODO Auto-generated method stub
		new DaoRepository().adiciona(pessoa);
		FacesMessage mensagem = new FacesMessage(pessoa.getClass().getCanonicalName() + " cadastrado(a) com sucesso.");
		FacesContext.getCurrentInstance().addMessage(null, mensagem);
		return "/listar" + pessoa.getClass().getCanonicalName() + "s.jsf";
	}
}
