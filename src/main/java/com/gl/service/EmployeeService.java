package com.gl.service;

import java.util.List;

import com.gl.model.Employee;

public interface EmployeeService {

	public Employee getEmployeeByIdSvc(int id);

	public List<Employee> getAllEmployeesSvc();

	public void saveEmployeeSvc(Employee employee);

	public void deleteEmployeeSvc(int id);

}
