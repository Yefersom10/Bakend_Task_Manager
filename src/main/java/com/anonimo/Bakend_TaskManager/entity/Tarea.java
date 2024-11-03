package com.anonimo.Bakend_TaskManager.entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tareas")
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String namTarea;
    private  String descripcion;
    @Temporal(TemporalType.DATE)
    private Date fecha_creacion;

    public Tarea() {
    }

    public Tarea(Integer id, String namTarea, String descripcion, Date fecha_creacion) {
        this.id = id;
        this.namTarea = namTarea;
        this.descripcion = descripcion;
        this.fecha_creacion = fecha_creacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamTarea() {
        return namTarea;
    }

    public void setNamTarea(String namTarea) {
        this.namTarea = namTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }
}
