package br.com.taipanet.model;


import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Lancamento implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private long id;
	@OneToOne
	private Conta conta;
	@OneToOne
	private Pessoa pessoa;
	private String descricao;
	private Calendar dataBaixa;
	private Calendar dataLancamento;
	private Double valorLançado;
	
	public Lancamento() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Calendar getDataBaixa() {
		return dataBaixa;
	}

	public void setDataBaixa(Calendar dataBaixa) {
		this.dataBaixa = dataBaixa;
	}

	public Calendar getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Calendar dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public Double getValorLançado() {
		return valorLançado;
	}

	public void setValorLançado(Double valorLançado) {
		this.valorLançado = valorLançado;
	}
	
	
}
