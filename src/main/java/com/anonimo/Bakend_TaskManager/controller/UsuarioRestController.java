package com.anonimo.Bakend_TaskManager.controller;

import com.anonimo.Bakend_TaskManager.entity.Usuario;
import com.anonimo.Bakend_TaskManager.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins ="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UsuarioRestController {
    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/usuarios")
    public List<Usuario> index(){
        return usuarioService.findall();
    }
    @GetMapping("/usuarios/{id}")
    public Usuario show(@PathVariable Long id){
        return usuarioService.findById(id);
    }

    @PostMapping("/usuarios")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario create(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }
    @PutMapping("/usuarios/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario update(@RequestBody Usuario usuario, @PathVariable Long id){
        Usuario usuarioActual = usuarioService.findById(id);
        usuarioActual.setNomUsuario(usuario.getNomUsuario());
        usuarioActual.setContrasenia(usuario.getContrasenia());
        usuarioActual.setEmail(usuario.getEmail());
        usuarioActual.setRol(usuario.getRol());
        return usuarioService.save(usuarioActual);
    }
    @DeleteMapping("/usuarios/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        usuarioService.delete(id);
    }
}
