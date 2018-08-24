package my;


import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Entity;


@XmlRootElement
@Entity
public class EmployeeEntity<EmployeeEntity> {
	@Id
	private int id;
	@NotNull(message="Name can not be Null")
	@Size(min=1,max=20)
private String name;
	
	private int age;
	
	private int salary;
	
	private String department;
	
	private char sex;
	
	private String lan;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	
	
	

	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", name=" + name + ", age=" + age
				+ ", salary=" + salary + ", department=" + department
				+ ", sex=" + sex + ", lan=" + lan + "]";
	}


	public String getLan() {
		return lan;
	}


	public void setLan(String lan) {
		this.lan = lan;
	}


	public char getSex() {
		return sex;
	}


	public void setSex(char sex) {
		this.sex = sex;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	


	



}
