package br.com.taipanet.managedbean;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import br.com.taipanet.model.Usuario;
import br.com.taipanet.repository.UsuarioRepository;

@ManagedBean @ViewScoped
public class LoginBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String usuario;
	private String senha;
	
	public LoginBean() {
		// TODO Auto-generated constructor stub
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String autenticar(){
		FacesContext fc = FacesContext.getCurrentInstance();
		if (new UsuarioRepository().autenticar(this.usuario, new Usuario().criarHash(usuario + senha))){
			ExternalContext ec = fc. getExternalContext();
			HttpSession session = (HttpSession) ec.getSession(false);
			session.setAttribute("usuario", this.usuario);
			return "/home";
		} else {
			FacesMessage fm = new FacesMessage("Usuário ou senha não encontrados");
			fm.setSeverity(FacesMessage.SEVERITY_ERROR);
			fc.addMessage(null, fm);
			return "/index";
			}		
	}
	
	public String logout(){
		try{
		FacesContext fc = FacesContext.getCurrentInstance();
		ExternalContext ec = fc. getExternalContext();
		HttpSession session = (HttpSession) ec.getSession(false);
		session.setAttribute("usuario", null);
		} catch (Exception e){
			System.out.println("Não foi possível limpar o usuário.");
		}
		return "/home";
		
	}
	
}
