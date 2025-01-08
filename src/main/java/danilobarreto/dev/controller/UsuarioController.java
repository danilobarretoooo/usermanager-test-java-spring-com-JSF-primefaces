package danilobarreto.dev.controller;

import danilobarreto.dev.model.entity.Usuario;
import danilobarreto.dev.service.IUsuarioService;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import lombok.Getter;
import lombok.Setter;
import org.primefaces.PrimeFaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@Component(value = "usuarioMB")
@ViewScoped
public class UsuarioController{

    @Autowired
    private IUsuarioService usuarioService;

    private Usuario usuario;
    private List<Usuario> usuarios;

    public List<Usuario> getUsuarios() {
        return usuarios = usuarioService.listar();
    }

    public void novo(){
        usuario = new Usuario();
    }

    public IUsuarioService getUsuarioService() {
        return usuarioService;
    }

    public void setUsuarioService(IUsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void save(){
        if (usuario.getIdUsuario() == null){
            usuarioService.create(usuario);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Save"));
        }else{
            usuarioService.create(usuario);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Save"));
        }
        save();
        PrimeFaces.current().ajax().update("form:messages", "form:dt-usuarios");
        PrimeFaces.current().executeScript("PF('dlgUsuario').hide();");
    }

    public void deleteUser(){
        usuarioService.deleteUser(usuario);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Delete"));
        PrimeFaces.current().ajax().update("form:messages", "form:dt-usuarios");

    }

}
