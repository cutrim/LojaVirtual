package br.com.taipanet.managedbean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.taipanet.model.TipoContato;
import br.com.taipanet.repository.DaoRepository;

@ManagedBean
public class ContatoBean {
	
	public ContatoBean() {
		// TODO Auto-generated constructor stub
	}
	
	@SuppressWarnings("unchecked")
	public List<TipoContato> getTiposContatos(){
		return new DaoRepository().listar(TipoContato.class);
	}
}
