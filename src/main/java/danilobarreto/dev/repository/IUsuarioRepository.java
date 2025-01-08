package danilobarreto.dev.repository;

import danilobarreto.dev.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

}
