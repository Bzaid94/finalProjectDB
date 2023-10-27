package com.umg.edu.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class TrabajadorReporte {
    @Id
    private Long id_trabajador;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private Date fecha_ingreso;
    private Date fecha_baja;
    private String sit_trabajador;
    @Column(name = "descripcion_compania")
    private String descripcion_compania;
    @Column(name = "descripcion_puesto")
    private String descripcion_puesto;

    public TrabajadorReporte(Long id_trabajador, String nombre, String apellido_paterno,
                             String apellido_materno, Date fecha_ingreso, Date fecha_baja,
                             String sit_trabajador, String descripcion_compania,
                             String descripcion_puesto) {
        this.id_trabajador = id_trabajador;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_baja = fecha_baja;
        this.sit_trabajador = sit_trabajador;
        this.descripcion_compania = descripcion_compania;
        this.descripcion_puesto = descripcion_puesto;
    }
}