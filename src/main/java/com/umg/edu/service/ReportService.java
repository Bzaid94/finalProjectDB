package com.umg.edu.service;

import com.umg.edu.entity.ViewSueldos;
import com.umg.edu.repository.SueldosViewRepository;
import com.umg.edu.entity.TrabajadorReporte;
import com.umg.edu.repository.TrabajadorRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReportService {

    @Autowired
    private SueldosViewRepository sueldosViewRepository;
    @Autowired
    private TrabajadorRepository trabajadorRepository;
    @PersistenceContext
    private EntityManager entityManager;

    public String generateCSVReport() {
        List<ViewSueldos> sueldos = sueldosViewRepository.findAll();

        StringBuilder builder = new StringBuilder();
        builder.append("id_trabajador,nombre,apellido,segundoApellido,sueldoActual,sueldoBase,sueldoDolares \n");

        for (ViewSueldos sueldo : sueldos) {
            builder.append(sueldo.getIdTrabajador())
                    .append(",")
                    .append(sueldo.getNombre())
                    .append(",")
                    .append(sueldo.getApellido_paterno())
                    .append(",")
                    .append(sueldo.getApellido_materno())
                    .append(",")
                    .append(sueldo.getSueldo_actual())
                    .append(",")
                    .append(sueldo.getSueldo_base())
                    .append(",")
                    .append(sueldo.getSueldo_dolares())
                    .append("\n");
        }
        return builder.toString();
    }

    public List<TrabajadorReporte> obtenerReporteTrabajadores(int compania, int idTrabajador) {
        StoredProcedureQuery query = entityManager.createStoredProcedureQuery("sp_reporte_trabajadores", TrabajadorReporte.class);
        query.registerStoredProcedureParameter("compania", Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter("idtrabajador", Integer.class, ParameterMode.IN);
        query.setParameter("compania", compania);
        query.setParameter("idtrabajador", idTrabajador);
        return query.getResultList();
    }
}