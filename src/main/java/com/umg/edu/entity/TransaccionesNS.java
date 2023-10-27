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
@Table(name = "transacciones_ns")
public class TransaccionesNS {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_transaccion;
    private Long id_trabajador;
    private Long id_concepto;
    private Long importe;
    private Integer sit_transaccion;
    private Date fecha_origen;
}
