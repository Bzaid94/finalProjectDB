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
@Table(name = "mov_trans")
public class MovTrans {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_mov;
    private String usuario;
    private Integer id_transaccion;
    private String detalle;
    private Date fecha_cambio;
}
