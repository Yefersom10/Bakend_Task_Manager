package com.anonimo.Bakend_TaskManager.service;

import com.anonimo.Bakend_TaskManager.entity.Tarea;
import com.anonimo.Bakend_TaskManager.exeption.ResourceNotFoundException;
import com.anonimo.Bakend_TaskManager.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TareaServiceImpl implements TareaService {
    @Autowired
    private TareaRepository tareaRepository;
    @Override
    @Transactional(readOnly = true)
    public List<Tarea> findall(){
        return (List<Tarea>) tareaRepository.findAll();
    }
    @Override
    @Transactional(readOnly = true)
    public Tarea findById(Long id){
        return tareaRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Tarea save(Tarea tarea) {
        return tareaRepository.save(tarea);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        tareaRepository.deleteById(id);
    }
}
