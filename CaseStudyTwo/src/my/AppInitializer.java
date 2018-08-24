package my;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitializer implements WebApplicationInitializer {

	public AppInitializer() {
		// TODO Auto-generated constructor stub
		System.out.println("AppInitializer");
	}
	
	@Override
	public void onStartup(ServletContext sctx) throws ServletException {
		WebApplicationContext ctx =getContext();
		
		  sctx.addListener(new ContextLoaderListener(ctx));
		ServletRegistration.Dynamic registration=sctx.addServlet("dispatcher", new DispatcherServlet(ctx));
		//registration.setLoadOnStartup(1);
		registration.addMapping("/shiva/*");
		
	}

	private AnnotationConfigWebApplicationContext getContext() {
		  AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		  context.setConfigLocation("my.AppConfig");
		  return context;
		 }
}
