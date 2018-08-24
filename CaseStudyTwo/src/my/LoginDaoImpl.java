package my;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

//import javax.transaction.Transactional;
//import javax.transaction.Transactional.TxType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.jdbc.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class LoginDaoImpl implements LoginDao{
	@Autowired
    private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
        return sessionFactory
        
        		
        		.getCurrentSession();
        
    }
	@Override
	@Transactional()
	public boolean myInsert(EmployeeEntity employeeEntity) {
		
		
			
		getCurrentSession().save(employeeEntity);
		
		
		return false;
		
	}
	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED)
	public List<EmployeeEntity> giveEmployee() {
		// TODO Auto-generated method stub
		return getCurrentSession().createQuery("from EmployeeEntity").list();
	}

	
	@Override
	@Transactional
	public EmployeeEntity getEmployee(int id) {
		// TODO Auto-generated method stub
		return (EmployeeEntity) getCurrentSession().get(EmployeeEntity.class,id);
	}
	
	
}
