package com.anonimo.Bakend_TaskManager.service;

import com.anonimo.Bakend_TaskManager.entity.Tarea;
import com.anonimo.Bakend_TaskManager.exeption.ResourceNotFoundException;
import com.anonimo.Bakend_TaskManager.repository.TareaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaServiceImpl implements TareaService {

    private  final TareaRepository tareaRepository;

    public TareaServiceImpl(TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    @Override
    public Tarea save(Tarea tarea) {
        return tareaRepository.save(tarea);
    }



    @Override
    public List<Tarea> finAdll() {
        return tareaRepository.findAll();
    }

    @Override
    public Tarea findById(Integer id) {
        Tarea tarea= tareaRepository.findById(id).orElseThrow(
                ()->{
                    throw new ResourceNotFoundException("Tarea con id "+id+" no se encuentra");
                }
        );
        //return tareaRepository.findById(id).get();
        return  tarea;
    }


    @Override
    public void deleteById(Integer id) {
        tareaRepository.deleteById(id);
    }

    @Override
    public Tarea update(Tarea tarea) {
        return tareaRepository.save(tarea);
    }


}
