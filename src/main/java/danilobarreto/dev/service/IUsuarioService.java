package danilobarreto.dev.service;

import danilobarreto.dev.model.entity.Usuario;

import java.util.List;

public interface IUsuarioService {

    public Usuario create(Usuario usuario);

    public Usuario buscarId(Integer id);

    public List<Usuario> listar();

    public void deleteUser(Usuario usuario);

}
