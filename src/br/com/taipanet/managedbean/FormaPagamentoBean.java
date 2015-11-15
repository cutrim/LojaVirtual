package br.com.taipanet.managedbean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.taipanet.model.FormaPagamento;
import br.com.taipanet.repository.DaoRepository;

@ManagedBean
public class FormaPagamentoBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private FormaPagamento formaPagamento = new FormaPagamento();
	
	public FormaPagamentoBean() {
		// TODO Auto-generated constructor stub
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@SuppressWarnings("unchecked")
	public List<FormaPagamento> getFormasPagamento(){
		return new DaoRepository().listar(FormaPagamento.class);
	}

}
