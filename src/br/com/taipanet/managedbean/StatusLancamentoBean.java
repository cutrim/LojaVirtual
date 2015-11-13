package br.com.taipanet.managedbean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.taipanet.model.StatusLancamento;
import br.com.taipanet.repository.DaoRepository;

@ManagedBean
public class StatusLancamentoBean  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	StatusLancamento status = new StatusLancamento();
	
	public StatusLancamentoBean() {
		// TODO Auto-generated constructor stub
	}

	public StatusLancamento getStatus() {
		return status;
	}

	public void setStatus(StatusLancamento status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String cadastrar(){
		new DaoRepository().adiciona(this.status);
		this.status = new StatusLancamento();
		return "listarStatusLancamentos";
	}
	
	@SuppressWarnings("unchecked")
	public List<StatusLancamento> getStatusLancamentos(){
		return new DaoRepository().listar(StatusLancamento.class);
	}

}
