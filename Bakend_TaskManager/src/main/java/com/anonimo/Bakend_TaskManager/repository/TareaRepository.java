package com.anonimo.Bakend_TaskManager.repository;

import com.anonimo.Bakend_TaskManager.entity.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareaRepository extends JpaRepository<Tarea, Integer> {
}
