package org.demo.app.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.demo.app.dto.EmployeeDto;
import org.demo.app.util.EmployeeUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Log4j2
public class EmployeeService {


    public List<EmployeeDto> createRandomList(int size) {
        return EmployeeUtil.getEmployeeDtoList(size);
    }


    public List<EmployeeDto> findList() {
        return EmployeeUtil.getEmployeeDtoList(20);
    }


    public EmployeeDto findById(Long id) {
        EmployeeDto employeeDto = EmployeeUtil.createRandomEmployeeDto();
        employeeDto.setId(id);
        return employeeDto;
    }

    public Long count() {
        return 3000L;
    }


    public EmployeeDto createOrUpdate(EmployeeDto employeeDto) {
        return employeeDto;
    }


    public void delete(Long id) {
    }

}
