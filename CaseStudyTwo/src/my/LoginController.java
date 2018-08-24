package my;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	
	private LoginService loginService;
	
	public LoginService getLoginService() {
		return loginService;
	}
	@Autowired
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	@RequestMapping(value="/put",method=RequestMethod.PUT,consumes=MediaType.APPLICATION_XML_VALUE)
	public void invokePut(Employee e)
	{
		System.out.println(e.getAge());
	}
	
	
	@RequestMapping("/form")
	public void giveForm(@ModelAttribute("shiva")EmployeeEntity employeeEntity)
	
	{
		
			
			System.out.println("VOID CLASS");
		return ;// "loginForm";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/insert")
	public String saveEmployee(@ModelAttribute("shiva")@Valid EmployeeEntity employeeEntity,Model model,BindingResult result)
	{
		//ModelMap mmap=new ModelMap();
		if(result.hasFieldErrors())
		{
			return "error";
		}
		loginService.insertEmployee(employeeEntity);
		//model.addAttribute("one", "hello");
		model.addAttribute("two",employeeEntity);
	System.out.println(employeeEntity);
	return "loginForm";
	}
	//@Transactional
	@RequestMapping(method=RequestMethod.GET,value="/dispaly")
	
	public String displayEmployee(Model model)
	{
		System.out.println("DISPLAY");
		model.addAttribute("two", loginService.displayEmployee());
			
	return "insert";
	}

	@RequestMapping(method=RequestMethod.GET,value="/get/{id}")//,produces= {"application/json"})
	
	public EmployeeEntity getEmployee(@PathVariable("id")int id)
	{
		return loginService.getEmployee(id);
	}
}
