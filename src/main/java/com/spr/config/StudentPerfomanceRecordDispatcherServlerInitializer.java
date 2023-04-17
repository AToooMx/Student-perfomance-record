package com.spr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class StudentPerfomanceRecordDispatcherServlerInitializer
		extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {

		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class<?> arr[] = { StudentPerfomanceRecordConfiguration.class, StudentPerfomanceRecordSecurityConfig.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String[] arr = { "/" };
		return arr;
	}
}
