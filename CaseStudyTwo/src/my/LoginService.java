package my;

import java.util.List;

public interface LoginService {
	void insertEmployee(EmployeeEntity s);
	List<EmployeeEntity> displayEmployee();
	public EmployeeEntity getEmployee(int id);
}
