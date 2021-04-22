package com.intern.rest;

import com.intern.dto.NhanVienDTO;
import com.intern.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeRest {
    @Autowired
    private NhanVienService nhanVienService;

    @GetMapping("/employees")
    public ResponseEntity<List<NhanVienDTO>> getEmployees() {
        List<NhanVienDTO> dataResponse = nhanVienService.getEmployees();
        return ResponseEntity.ok(dataResponse);
    }

    @GetMapping("/employees-not-sales")
    public ResponseEntity<List<NhanVienDTO>> getEmpNotSales() {
        List<NhanVienDTO> dataResponse = nhanVienService.getEmpNotSales();
        return ResponseEntity.ok(dataResponse);
    }
}
