package br.com.taipanet.managedbean;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.taipanet.model.Conta;
import br.com.taipanet.model.Lancamento;
import br.com.taipanet.model.Pessoa;
import br.com.taipanet.model.StatusLancamento;
import br.com.taipanet.repository.DaoRepository;

@ManagedBean
public class LancamentosBean implements Serializable{
	private Lancamento lancamento = new Lancamento();
	private Date dataLancamento;
	private Date dataBaixa;
	private Pessoa pessoa = new Pessoa();
	private Conta conta = new Conta();
	private StatusLancamento status = new StatusLancamento();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public LancamentosBean() {
		// TODO Auto-generated constructor stub
	}
	
	public String cadastrar(){
		Calendar cal=Calendar.getInstance();
		DateFormat format=new SimpleDateFormat("yyyy/mm/dd");
		format.format(this.getDataBaixa());
		cal=format.getCalendar();
		this.lancamento.setDataBaixa(cal);
		format.format(this.getDataLancamento());
		cal=format.getCalendar();
		this.lancamento.setDataLancamento(cal);
		this.lancamento.setDataCadastro(Calendar.getInstance());
		this.lancamento.setConta(conta);
		this.lancamento.setPessoa(pessoa);
		this.lancamento.setStatus(status);
		new DaoRepository().adiciona(this.lancamento);
		this.lancamento = new Lancamento();
		this.pessoa = new Pessoa();
		this.dataBaixa = null;
		this.dataLancamento = null;
		return "listarLancamentos";
	}
	
	@SuppressWarnings("unchecked")
	public List<Lancamento> getLancamentos(){
		return new DaoRepository().listar(Lancamento.class);
	}

	public Lancamento getLancamento() {
		return lancamento;
	}

	public void setLancamento(Lancamento lancamento) {
		this.lancamento = lancamento;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Date getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public Date getDataBaixa() {
		return dataBaixa;
	}

	public void setDataBaixa(Date dataBaixa) {
		this.dataBaixa = dataBaixa;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public StatusLancamento getStatus() {
		return status;
	}

	public void setStatus(StatusLancamento status) {
		this.status = status;
	}
	
}
