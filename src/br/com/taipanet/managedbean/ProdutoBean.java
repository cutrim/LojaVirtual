package br.com.taipanet.managedbean;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import br.com.taipanet.model.Produto;
import br.com.taipanet.repository.DaoRepository;

@ManagedBean @SessionScoped
public class ProdutoBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Produto produto = new Produto();
	private UploadedFile imagem;
	
	public ProdutoBean() {
		// TODO Auto-generated constructor stub
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public UploadedFile getImagem() {
		return imagem;
	}

	public void setImagem(UploadedFile imagem) {
		this.imagem = imagem;
	}

	public String adicionar(){
		this.produto.setEstoque(0);
		new DaoRepository().adiciona(produto);
		/*try{
			File file = new File("C:/" + imagem.getFileName());  	
			InputStream in = new BufferedInputStream(imagem.getInputstream());  
            FileOutputStream fout = new FileOutputStream(file);    
            while (in.available() != 0) {  
                fout.write(in.read());  
            }  
            fout.close();  
		} catch (Exception e){
			System.out.println("Problema ao salvar a imagem no banco. Erro: " + e.getMessage());
			
		}*/
		this.produto = new Produto();
		
		    
		return "listarProdutos.jsf";
	}
	
	@SuppressWarnings("unchecked")
	public List<Produto> getProdutos(){
		return new DaoRepository().listar(Produto.class);
	}
	
	public List<Produto> getProdutosEmEstoque(){
		return new DaoRepository().listar(Produto.class);
	}
	
	public void handleFileUpload(FileUploadEvent event) {
		FacesMessage message;
		try{
			this.imagem = event.getFile();
			message = new FacesMessage("Succesful", event.getFile().getFileName() + " foi enviado.");
	        FacesContext.getCurrentInstance().addMessage(null, message);
		} catch(Exception e){
			message = new FacesMessage("", event.getFile().getFileName() + " foi enviado.");
	        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Fatal!", "Arquivo inválido."));
			System.out.println("Arquivo carregado inválido." + e.getMessage());
		}
        
    }
}
