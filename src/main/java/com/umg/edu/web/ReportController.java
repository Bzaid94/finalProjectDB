package com.umg.edu.web;

import com.umg.edu.entity.TrabajadorReporte;
import com.umg.edu.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/report/csv")
    public ResponseEntity<byte[]> getCSVReport() {
        String csvReport = reportService.generateCSVReport();
        byte[] csvBytes = csvReport.getBytes(StandardCharsets.UTF_8);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_PLAIN);
        headers.setContentDisposition(ContentDisposition.builder("attachment").filename("report.csv").build());

        return new ResponseEntity<>(csvBytes, headers, HttpStatus.OK);
    }

    @GetMapping("/reporte")
    public List<TrabajadorReporte> obtenerReporteTrabajadores(@RequestParam int compania, @RequestParam int idTrabajador) {
        return reportService.obtenerReporteTrabajadores(compania, idTrabajador);
    }
}