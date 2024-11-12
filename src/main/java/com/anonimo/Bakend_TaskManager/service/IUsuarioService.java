package com.anonimo.Bakend_TaskManager.service;

import com.anonimo.Bakend_TaskManager.entity.Usuario;

import java.util.List;

public interface IUsuarioService {
    public List<Usuario> findall();
    public Usuario findById(Long id);
    public Usuario save(Usuario usuario);
    public void delete(Long id);
}
