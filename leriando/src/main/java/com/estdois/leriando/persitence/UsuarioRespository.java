package com.estdois.leriando.persitence;

import com.estdois.leriando.entity.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRespository extends CrudRepository<Usuario, Long> {


}
