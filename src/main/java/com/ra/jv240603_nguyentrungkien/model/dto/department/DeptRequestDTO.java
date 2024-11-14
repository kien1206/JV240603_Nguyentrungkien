package com.ra.jv240603_nguyentrungkien.model.dto.department;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Builder
@Getter
public class DeptRequestDTO {
    private String deptName;
    private String deptDescription;

    private boolean deptStatus;
}