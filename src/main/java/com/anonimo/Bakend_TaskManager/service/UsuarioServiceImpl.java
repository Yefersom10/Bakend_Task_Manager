package com.anonimo.Bakend_TaskManager.service;

import com.anonimo.Bakend_TaskManager.entity.Tarea;
import com.anonimo.Bakend_TaskManager.entity.Usuario;
import com.anonimo.Bakend_TaskManager.repository.IUsuarioRepository;
import com.anonimo.Bakend_TaskManager.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioServiceImpl implements IUsuarioService{
    @Autowired
    private IUsuarioRepository usuarioRepository;
    @Override
    @Transactional(readOnly = true)
    public List<Usuario> findall(){
        return (List<Usuario>) usuarioRepository.findAll();
    }
    @Override
    @Transactional(readOnly = true)
    public Usuario findById(Long id){
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        usuarioRepository.deleteById(id);
    }
}
