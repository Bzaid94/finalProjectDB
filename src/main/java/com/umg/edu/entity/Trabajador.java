package com.umg.edu.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "trabajadores")
public class Trabajador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_trabajador;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String telefono;
    private String direccion;
    private String dpi;
    private String nit;
}
