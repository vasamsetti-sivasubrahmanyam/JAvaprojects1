package my;

import java.util.List;

public interface LoginDao {
	public boolean myInsert(EmployeeEntity employeeEntity);

	public List<EmployeeEntity> giveEmployee();
	
	public EmployeeEntity getEmployee(int id);
}
