package com.anonimo.Bakend_TaskManager.controller;

import com.anonimo.Bakend_TaskManager.entity.Tarea;
import com.anonimo.Bakend_TaskManager.repository.TareaRepository;
import com.anonimo.Bakend_TaskManager.service.TareaService;
import jakarta.persistence.NamedStoredProcedureQueries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//http://localhost:8080/api/tarea
@CrossOrigin(origins ="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class TareaController {
    @Autowired
    private TareaService tareaService;

    @GetMapping("/tareas")
    public List<Tarea> index(){
        return tareaService.findall();
    }
    @GetMapping("/tareas/{id}")
    public Tarea show(@PathVariable Long id){
        return tareaService.findById(id);
    }

    @PostMapping("/tareas")
    @ResponseStatus(HttpStatus.CREATED)
    public Tarea create(@RequestBody Tarea tarea){
        return tareaService.save(tarea);
    }
    @PutMapping("/tareas/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Tarea update(@RequestBody Tarea tarea, @PathVariable Long id){
        Tarea tareaActual = tareaService.findById(id);
        tareaActual.setNamTarea(tarea.getNamTarea());
        tareaActual.setDescripcion(tarea.getDescripcion());
        tareaActual.setFecha_creacion(tarea.getFecha_creacion());
        return tareaService.save(tareaActual);
    }
    @DeleteMapping("/tareas/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        tareaService.delete(id);
    }
}
