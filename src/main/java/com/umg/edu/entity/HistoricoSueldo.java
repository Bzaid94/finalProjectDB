package com.umg.edu.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "historico_sueldos")
public class HistoricoSueldo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_sueldos;
    private Long id_trabajador;
    private Long sueldo_base;
    private Long sueldo_actual;
    private Integer sit_bonificacion;
}
