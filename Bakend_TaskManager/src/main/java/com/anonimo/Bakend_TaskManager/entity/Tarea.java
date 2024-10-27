package com.anonimo.Bakend_TaskManager.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "tareas")
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String namTarea;
    private  String descripcion;
    private String fecha_creacion;

    public Tarea() {
    }

    public Tarea(Integer id, String namTarea, String descripcion, String fecha_creacion) {
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

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }
}
