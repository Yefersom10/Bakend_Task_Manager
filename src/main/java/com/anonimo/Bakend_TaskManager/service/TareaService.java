package com.anonimo.Bakend_TaskManager.service;

import com.anonimo.Bakend_TaskManager.entity.Tarea;

import java.util.List;

public interface TareaService {
    public List<Tarea> findall();
    public Tarea findById(Long id);

    public Tarea save(Tarea tarea);
    public void delete(Long id);

}
