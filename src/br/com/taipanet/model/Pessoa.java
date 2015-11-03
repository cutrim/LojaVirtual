package br.com.taipanet.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.com.taipanet.util.FormatarData;

@Entity
public class Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue
	private long id;
	@Column(nullable=false)
	private String nomeRazao;
	@Column(nullable=false)
	private String cpfCnpj;
	private SexoEnum sexo;
	@Embedded
	private Endereco endereco;
	private ArrayList<Contato> contatos;
	//@OneToOne(optional=false, fetch=FetchType.LAZY) @JoinColumn(name="criador_id",nullable=true)
	//private Usuario criador;
	//@OneToOne(optional=false, fetch=FetchType.LAZY) @JoinColumn(name="usuario_alteracao_id", nullable=true)
	//private Usuario usuarioUltimaAlteracao;
	@Column(nullable=false)
	private Calendar dataCadastro;
	@Column(nullable=false)
	private Calendar dataUltimaAlteracao;
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeRazao() {
		return nomeRazao;
	}

	public void setNomeRazao(String nomeRazao) {
		this.nomeRazao = nomeRazao;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public SexoEnum getSexo() {
		return sexo;
	}

	public void setSexo(SexoEnum sexo) {
		this.sexo = sexo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public ArrayList<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(ArrayList<Contato> contatos) {
		this.contatos = contatos;
	}

	/*public Usuario getCriador() {
		return criador;
	}

	public void setCriador(Usuario criador) {
		this.criador = criador;
	}

	public Usuario getUsuarioUltimaAlteracao() {
		return usuarioUltimaAlteracao;
	}

	public void setUsuarioUltimaAlteracao(Usuario usuarioUltimaAlteracao) {
		this.usuarioUltimaAlteracao = usuarioUltimaAlteracao;
	}*/

	public Calendar getDataCadastro() {
		return dataCadastro;
	}
	
	public String getDataCadastroString() {
		return new FormatarData().formatarData(dataCadastro);
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Calendar getDataUltimaAlteracao() {
		return dataUltimaAlteracao;
	}
	
	public String getDataUltimaAlteracaoString(){
		return new FormatarData().formatarData(dataUltimaAlteracao);
	}

	public void setDataUltimaAlteracao(Calendar dataUltimaAlteracao) {
		this.dataUltimaAlteracao = dataUltimaAlteracao;
	}
	
}
