package com.intern.rest;

import com.intern.dto.NhanVienDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeRest {

    @GetMapping("/employees")
    public ResponseEntity<List<NhanVienDTO>> getEmployees() {
        List<NhanVienDTO> dataResponse = new ArrayList<>();

        NhanVienDTO nv1 = new NhanVienDTO();
        nv1.setMaNhanVien("NV01");
        nv1.setHo("Nguyen");
        nv1.setTen("Vawn A");
        nv1.setNgaySinh(new Date());
        nv1.setNgayLamViec(new Date());
        nv1.setDiaChi("Ha Noi");
        nv1.setDiaChi("0123456789");
        nv1.setLuongCoBan(new BigDecimal("10000000"));
        nv1.setPhuCap(new BigDecimal("10000000"));

        dataResponse.add(nv1);

        return ResponseEntity.ok(dataResponse);
    }

    @GetMapping("/employee/{maNhanVien}")
    public ResponseEntity<String> getEmployees(@PathVariable String maNhanVien, @RequestParam String requestParam) {

        System.out.println("pathVariableMaNhanVien = " + maNhanVien);
        System.out.println("requestParam = " + requestParam);

        return ResponseEntity.ok("OK");
    }

    @PostMapping("/add-employee")
    public ResponseEntity<NhanVienDTO> addEmployee(@RequestBody NhanVienDTO nhanVienDTO) {
        System.out.println(nhanVienDTO);

        return ResponseEntity.ok(nhanVienDTO);
    }
}
