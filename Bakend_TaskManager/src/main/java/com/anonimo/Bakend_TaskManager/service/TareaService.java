package com.anonimo.Bakend_TaskManager.service;

import com.anonimo.Bakend_TaskManager.entity.Tarea;

import java.util.List;

public interface TareaService {
    Tarea save(Tarea tarea);
    List<Tarea> finAdll();
    Tarea findById(Integer id);
    void deleteById(Integer id);
    Tarea update(Tarea tarea);

}
