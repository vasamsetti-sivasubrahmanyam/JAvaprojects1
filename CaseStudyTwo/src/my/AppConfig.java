package my;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jndi.JndiTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"my"})
@EnableTransactionManagement
public class AppConfig {
	public AppConfig() {
		// TODO Auto-generated constructor stub
	System.out.println("AppConfig");
	}	
	
	@Bean
    public ViewResolver viewResolver() {

        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/jsp/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
	
	@Bean
	public LoginService giveLoginService()
	{
		return new LoginServiceImpl();
	}
	
@Bean
public LoginDao giveLoginDao()
{
	return new LoginDaoImpl();
}
	
	@Bean(name="dataSource")
public DataSource getDataSource()
{
	DataSource dataSource=null;

	JndiTemplate jndiTemplate=new JndiTemplate();
	try {
		dataSource= (DataSource) jndiTemplate.
				lookup("java:comp/env/jdbc/shivaDB");
	} catch (NamingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
return dataSource;
}
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource)
	{
LocalSessionFactoryBuilder localSessionFactoryBuilder=

new LocalSessionFactoryBuilder(dataSource);
		localSessionFactoryBuilder.addAnnotatedClasses(EmployeeEntity.class);
		localSessionFactoryBuilder.setProperty("hibernate.show_sql", "true");
		localSessionFactoryBuilder.setProperty("hibernate.hbm2ddl.auto", "create");
		localSessionFactoryBuilder.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		return localSessionFactoryBuilder.buildSessionFactory();
	}

	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(
	        SessionFactory sessionFactory) {
	    HibernateTransactionManager transactionManager = new HibernateTransactionManager(
	            sessionFactory);
	 
	    return transactionManager;
	}

}
