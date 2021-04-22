package com.intern.service;

import com.intern.dao.NhanVienDAO;
import com.intern.dto.NhanVienDTO;
import com.intern.entity.NhanVienBO;
import com.intern.mapper.NhanVienMapper;
import com.intern.repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienService {
    @Autowired
    private NhanVienRepository nhanVienRepository;
    @Autowired
    private NhanVienMapper nhanVienMapper;

    @Autowired
    private NhanVienDAO nhanVienDAO;

    public List<NhanVienDTO> getEmployees() {
        List<NhanVienBO> bos = nhanVienRepository.findAll();
        return nhanVienMapper.toDto(bos);
    }

    public List<NhanVienDTO> getEmpNotSales() {
        return nhanVienDAO.getEmployeeNotSales();
    }
}
