package br.com.taipanet.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.taipanet.model.SexoEnum;

@ManagedBean
public class SexoBean {
	public SexoBean() {
		// TODO Auto-generated constructor stub
	}
	
	public List<SexoEnum> getSexos(){
		List<SexoEnum> lista = new ArrayList<SexoEnum>();
		lista.add(SexoEnum.M);
		lista.add(SexoEnum.F);
		return lista;
	}
}
