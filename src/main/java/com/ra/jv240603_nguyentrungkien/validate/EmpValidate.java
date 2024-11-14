package com.ra.jv240603_nguyentrungkien.validate;

import com.ra.jv240603_nguyentrungkien.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class EmpValidate implements ConstraintValidator<EmpUnique,String> {
    @Autowired
    private EmpRepository empRepository;
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return !empRepository.existsEmployeeByEmpEmail(value) && !empRepository.existsEmployeeByEmpPhone(value);
    }
}
