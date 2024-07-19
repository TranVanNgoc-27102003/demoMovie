package com.poly.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.poly.entity.taikhoan;

public interface taikhoanRepo extends JpaRepository<taikhoan,Integer> {
	
	@Query("SELECT t FROM taikhoan t WHERE t.tendn = :tendn AND t.matkhau = :matkhau")
    List<taikhoan> findByTendnAndMatkhau(String tendn, String matkhau);

}

