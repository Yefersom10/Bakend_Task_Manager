package com.anonimo.Bakend_TaskManager.repository;

import com.anonimo.Bakend_TaskManager.entity.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TareaRepository extends CrudRepository<Tarea, Long> {
}
