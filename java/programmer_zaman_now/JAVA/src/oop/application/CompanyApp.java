package oop.application;

import oop.data.Company;

public class CompanyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Company company = new Company();
		company.setName("Alwiya");
		
		Company.Employee employee = company.new Employee();
		employee.setName("Programmer Zaman Now");
		
		System.out.println(company.getName());
		
		System.out.println(employee.getName());
		System.out.println(employee.getCompany());
		
		Company company2 = new Company();
		company2.setName("Belum Ada");
		
		Company.Employee employee2 = company2.new Employee();
		employee2.setName("Alwi");
		
		System.out.println(employee2.getName());
		System.out.println(employee2.getCompany());
		
	}

}
