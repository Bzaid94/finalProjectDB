package com.umg.edu.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "info_trabajador")
public class InfoTrabajador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_generacion;
    private Long id_trabajador;
    private Long id_compania;
    private Date fecha_ingreso;
    private Date fecha_baja;
    private Long sit_trabajador;
    private Long id_puesto;
}
