package com.gl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gl.model.Employee;

import com.gl.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping("/list")
	public String getEmployees(Model model) {
		List<Employee> employees = employeeService.getAllEmployeesSvc();
		model.addAttribute("employees", employees);
		return "employeelist";
	}

	@RequestMapping("/add")
	public String showAddEmployeeForm(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "employeeform";
	}

	@RequestMapping("/update")
	public String showFormForUpdate(@RequestParam("empId") int eid, Model model) {
		Employee employee1 = employeeService.getEmployeeByIdSvc(eid);
		model.addAttribute("employee", employee1);
		return "employeeform";
	}

	@RequestMapping("/save")
	public String saveEmployee(@RequestParam("empId") int eId, @RequestParam("empName") String eName,
			@RequestParam("empAddr") String eAddr, @RequestParam("empPhone") String ePhon,
			@RequestParam("empSalary") String eSalary, Model model) {
		Employee employee = new Employee();
		if (eId != 0) {
			employee = employeeService.getEmployeeByIdSvc(eId);
			employee.setEmployeeName(eName);
			employee.setEmployeeAddress(eAddr);
			employee.setEmployeePhone(ePhon);
			employee.setEmployeeSalary(eSalary);

		} else {
			employee = new Employee(eName, eAddr, ePhon, eSalary);
		}
		employeeService.saveEmployeeSvc(employee);
		return "redirect:/employees/list";
	}

	@RequestMapping("/delete")
	public String deleteEmployee(@RequestParam("empId") int eid) {
		employeeService.deleteEmployeeSvc(eid);
		return "redirect:/employees/list";
	}

}
