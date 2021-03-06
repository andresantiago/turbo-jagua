package bean.web;

import java.util.Map;
import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

//

@ManagedBean(value="usuarioIbb")
@RequestScoped

public class UsuarioIbb {
	private String nome;
	private String email;
	private String senha;
	private String confirmaSenha;
	
	@ManagedProperty(value="#{param}")
	private Map<String, String> parametros;
	
	public String operacao(){
		// executa a opeaÃ§Ã£o
		return "resultado";
	}
	
	public String inicio(){
		return "inicio";
	}
	
	public String novo(){
		return "usuario";
	}
	
	public String salvar(){
		FacesContext context = FacesContext.getCurrentInstance();
		if (!this.senha.equalsIgnoreCase(this.confirmaSenha)){
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Senha confirmada incorretamente",""));
			return "usuario";
		}
		//Salva o usuario
		return "secesso";
	}

	public String getUsuario() {
		return nome;
	}

	public void setUsuario(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConfirmaSenha() {
		return confirmaSenha;
	}

	public void setConfirmaSenha(String confirmaSenha) {
		this.confirmaSenha = confirmaSenha;
	}
	
}
