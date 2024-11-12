package com.anonimo.Bakend_TaskManager.repository;

import com.anonimo.Bakend_TaskManager.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioRepository extends CrudRepository<Usuario, Long> {
}
