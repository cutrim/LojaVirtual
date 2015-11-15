package br.com.taipanet.filtros;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;

import br.com.taipanet.repository.DaoRepository;

@WebFilter(servletNames = {"Faces Servlet"})
public class ControleDeAcesso implements Filter{
	
	public ControleDeAcesso() {
		// TODO Auto-generated constructor stub
		System.out.println("Criou o filtro");
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destruiu o filtro");
		
	}
	
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		// TODO Auto-generated method stub		
		System.out.println("Executou o filtro");		
		
		HttpServletRequest req = (HttpServletRequest) arg0;
		HttpSession session = req.getSession();
		HttpServletResponse res;
		
		if (DaoRepository.getSess() == null){
			System.out.println("Conexão com o banco de dados nula");
			
				res = (HttpServletResponse) arg1 ;
				res.sendRedirect("index.jsf");
				
		}
		
		if (session.getAttribute("usuario")!= null){
			System.out.println("Usuário autenticado: " + session.getAttribute("usuario"));
			if (req.getRequestURI().endsWith("index.jsf")){
				res = (HttpServletResponse) arg1 ;
				res.sendRedirect("home.jsf");
			}	
		} else {
			System.out.println("Nenhum usuário autenticado.");
		}
		
		if (session.getAttribute("usuario")!= null || req.getRequestURI().endsWith("index.jsf")) {
			arg2.doFilter(arg0, arg1);			
		} else {
			res = (HttpServletResponse) arg1 ;
			res.sendRedirect("index.jsf");
		}		
		
	}
	
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("============= Inicializou o filtro =============");
		System.out.println();
		System.out.println("============= Efetuando conexão com o banco de dados =============");
		DaoRepository.setSess((Session) new DaoRepository().getManager().getDelegate());
	}
}