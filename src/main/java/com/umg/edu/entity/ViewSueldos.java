package com.umg.edu.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vw_sueldos")
public class ViewSueldos {
    @Id
    @Column(name = "id_trabajador")
    private Integer idTrabajador;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido_paterno")
    private String apellido_paterno;

    @Column(name = "apellido_materno")
    private String apellido_materno;

    @Column(name = "sueldo_actual")
    private String sueldo_actual;

    @Column(name = "sueldo_base")
    private String sueldo_base;

    @Column(name = "sueldo_dolares")
    private String sueldo_dolares;
}
