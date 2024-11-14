package com.ra.jv240603_nguyentrungkien.repository;

import com.ra.jv240603_nguyentrungkien.model.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DeptRepository extends JpaRepository<Department, Integer> {
    Optional<Department> findByDeptName(String name);

    Optional<Object> findByDeptNameIgnoreCase(String deptName);
}