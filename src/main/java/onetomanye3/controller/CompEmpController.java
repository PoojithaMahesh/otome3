package onetomanye3.controller;

import onetomanye3.dao.CompanyDao;
import onetomanye3.dao.EmployeeDao;
import onetomanye3.dto.Company;
import onetomanye3.dto.Employee;

public class CompEmpController {
public static void main(String[] args) {
//	Company company=new Company();
//	company.setId(1);
//	company.setName("ty");
//	company.setGst("abc");
//	
//	CompanyDao companyDao=new CompanyDao();
//	companyDao.saveCompany(company);
	
	
//	Employee employee=new Employee();
//	employee.setId(4);
//	employee.setName("avinash");
//	employee.setAddress("xyz");
//	
//	EmployeeDao employeeDao=new EmployeeDao();
//	employeeDao.saveEmployee(1, employee);
	
	
	
	
//	Company company=new Company();
//	company.setName("testyantra");
//	company.setGst("ty@123");
//	
//	CompanyDao companyDao=new CompanyDao();
//	companyDao.updateCompany(1, company);
	
	
//	
//	Employee employee=new Employee();
//	employee.setName("avi");
//	employee.setAddress("Bangalore");
//	
//	EmployeeDao employeeDao=new EmployeeDao();
//	employeeDao.updateEmployee(4, employee);
	
//	FIND
	
//	CompanyDao companyDao=new CompanyDao();
//	companyDao.findCompany(1);
//	EmployeeDao employeeDao=new EmployeeDao();
//	employeeDao.findEMployee(1);
	
//	DELETE
//	EmployeeDao employeeDao=new EmployeeDao();
//	employeeDao.deleteEMployee(4);
	
	CompanyDao companyDao=new CompanyDao();
	companyDao.deleteCompany(1);
	
	
	
}
}
