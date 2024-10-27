package com.anonimo.Bakend_TaskManager.controller;

import com.anonimo.Bakend_TaskManager.entity.Tarea;
import com.anonimo.Bakend_TaskManager.service.TareaService;
import jakarta.persistence.NamedStoredProcedureQueries;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//http://localhost:8080/api/tarea
@RequestMapping("/api/tarea")
public class TareaController {

    private final TareaService tareaService;

    public TareaController(TareaService tareaService) {
        this.tareaService = tareaService;
    }

    //http://localhost:8080/api/tarea
    @PostMapping
    public Tarea save(@RequestBody Tarea tarea){
        return  tareaService.save(tarea);
    }
    //http://localhost:8080/api/tarea
    @GetMapping
    public List<Tarea> findAll(){
        return tareaService.finAdll();
    }
    //http://localhost:8080/api/tarea/1
    @GetMapping("/{id}")
    public Tarea findById(@PathVariable Integer id){
        return tareaService.findById(id);
    }
    //http://localhost:8080/api/tarea/1
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        tareaService.deleteById(id);
    }
    //http://localhost:8080/api/tarea
    @PutMapping
    public Tarea updateTarea(@RequestBody Tarea tarea){
        Tarea tareaDB= tareaService.findById(tarea.getId());
        tareaDB.setNamTarea(tarea.getNamTarea());
        tareaDB.setDescripcion(tarea.getDescripcion());
        tareaDB.setFecha_creacion(tarea.getFecha_creacion());
        return  tareaService.update(tareaDB);
    }
}
