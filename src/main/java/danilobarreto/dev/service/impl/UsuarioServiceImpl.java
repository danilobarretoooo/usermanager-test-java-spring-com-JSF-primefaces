package danilobarreto.dev.service.impl;

import danilobarreto.dev.model.entity.Usuario;
import danilobarreto.dev.repository.IUsuarioRepository;
import danilobarreto.dev.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private IUsuarioRepository usuarioRepository;

    @Override
    public Usuario create(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario buscarId(Integer id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public List<Usuario> listar() {
        return (List<Usuario>) usuarioRepository.findAll();
    }


    @Override
    public void deleteUser(Usuario usuario) {
        usuarioRepository.delete(usuario);
    }
}
