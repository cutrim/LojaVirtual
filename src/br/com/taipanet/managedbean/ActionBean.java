package br.com.taipanet.managedbean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.taipanet.model.Action;
import br.com.taipanet.repository.DaoRepository;

@ManagedBean
public class ActionBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Action action = new Action();
	
	public ActionBean() {
		// TODO Auto-generated constructor stub
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Action getAction() {
		return action;
	}
	public void setAction(Action action) {
		this.action = action;
	}
	
	public String cadastrar(){
		new DaoRepository().adiciona(this.action);
		this.action = new Action();
		return "/listarActions.jsf";
	}
	
	
	
	@SuppressWarnings("unchecked")
	public List<Action> getActions(){
		return new DaoRepository().listar(Action.class);
	}

}
