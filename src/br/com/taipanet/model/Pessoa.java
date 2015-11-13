package br.com.taipanet.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.com.taipanet.util.FormatarData;

@Entity
public class Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue
	private Long id;
	@Column(nullable=false)
	private String nomeRazao;
	@Column(nullable=false)
	private String cpfCnpj;
	private SexoEnum sexo;
	@Embedded
	private Endereco endereco;
	@OneToMany
	private List<Contato> contatos;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
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
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		final int prime = 31;
        int result = 1;
        result = prime * result + ((id==null)?0:id.hashCode());
        return result;
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pessoa other = (Pessoa) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
	
    @Override
    public String toString() {
        return "Classe [id=" + id + ", nome=" + nomeRazao + ", cpfCnpj=" + cpfCnpj + "]";
    }
}
