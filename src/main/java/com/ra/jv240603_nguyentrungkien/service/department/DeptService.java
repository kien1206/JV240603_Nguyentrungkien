package com.ra.jv240603_nguyentrungkien.service.department;

import com.ra.jv240603_nguyentrungkien.model.dto.department.DeptRequestDTO;
import com.ra.jv240603_nguyentrungkien.model.dto.department.DeptResponseDTO;
import com.ra.jv240603_nguyentrungkien.model.dto.department.DeptUpdateRequestDTO;

import java.util.List;

public interface DeptService {
    List<DeptResponseDTO> findAll();
    DeptResponseDTO create(DeptRequestDTO deptRequestDTO);
    DeptResponseDTO findById(Integer id);
    DeptResponseDTO update(DeptUpdateRequestDTO deptUpdateRequestDTO);
    String delete(Integer id);
}

