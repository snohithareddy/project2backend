package com.niit.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//similar to web.xml
//<servlet></servlet>
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
    public WebAppInitializer(){
    	System.out.println("WebAppInitializer class is loaded and Instantiated");
    }
	
	protected Class<?>[] getRootConfigClasses() {
		return new Class[]{DBConfiguration.class};
	}

	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[]{WebAppConfig.class};
	}

	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[]{"/"};// <url-pattern>/</url-pattern> Any requests,it will forwarded to DispatcherServlet
	}

}