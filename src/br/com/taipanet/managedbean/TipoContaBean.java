package br.com.taipanet.managedbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import br.com.taipanet.model.TipoContaEnum;

@ManagedBean
public class TipoContaBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TipoContaBean() {
		// TODO Auto-generated constructor stub
	}
	
	public List<TipoContaEnum> getTipos(){
		List<TipoContaEnum> lista = new ArrayList<TipoContaEnum>();
		lista.add(TipoContaEnum.P);
		lista.add(TipoContaEnum.R);
		return lista;
	}
}
