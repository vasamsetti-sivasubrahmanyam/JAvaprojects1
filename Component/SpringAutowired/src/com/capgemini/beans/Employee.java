package com.capgemini.beans;

import org.springframework.beans.factory.annotation.Autowired;
@Component
public class Employee {
	private int empNum;
private String empName;
@Autowired
private Address address;
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Employee() {	
}
public int getEmpNum() {
	return empNum;
}
public void setEmpNum(int empNum) {
	this.empNum = empNum;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}

}
