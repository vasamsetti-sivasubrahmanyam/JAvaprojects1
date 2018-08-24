package my;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class LoginServiceImpl implements LoginService {
private LoginDao loginDao;


	public LoginDao getLoginDao() {
	return loginDao;
}

@Autowired
public void setLoginDao(LoginDao loginDao) {
	this.loginDao = loginDao;
}

//@Transactional(propagation=Propagation.REQUIRES_NEW)
	@Override
	public void insertEmployee(EmployeeEntity employeeEntity) {
		// TODO Auto-generated method stub
		loginDao.myInsert(employeeEntity);
	}

	@Override
	public List<EmployeeEntity> displayEmployee() {
		// TODO Auto-generated method stub
		return loginDao.giveEmployee();
		//return null;
	}

	@Override
	public EmployeeEntity getEmployee(int id) {
		// TODO Auto-generated method stub
		return loginDao.getEmployee(id);
	}

}
