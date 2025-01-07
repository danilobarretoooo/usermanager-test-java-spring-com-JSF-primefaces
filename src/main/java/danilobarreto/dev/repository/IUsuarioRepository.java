package danilobarreto.dev.repository;

import danilobarreto.dev.model.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioRepository extends CrudRepository<Usuario, Integer> {

}
