package com.intern.repository;

import com.intern.entity.NhanVienBO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVienBO, String> {
}
