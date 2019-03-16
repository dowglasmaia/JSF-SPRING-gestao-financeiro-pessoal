package jsf_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import jsf_spring.entity.Usuario;
import jsf_spring.service.UsuarioService;

@Controller
@Scope("request")
public class UsuarioController {

	@Autowired
	private UsuarioService service;

	private Usuario usuario;

	private String confirmaSenha;

	public UsuarioController() {
		
		this.usuario = new Usuario();
	}

	public String salvar() {		
		service.save(usuario);
		return "/pages/usuario.xhtml?faces-redirect=true";
	}

	/* ===Getters e Setters ==== */
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getConfirmaSenha() {
		return confirmaSenha;
	}

	public void setConfirmaSenha(String confirmaSenha) {
		this.confirmaSenha = confirmaSenha;
	}

}
