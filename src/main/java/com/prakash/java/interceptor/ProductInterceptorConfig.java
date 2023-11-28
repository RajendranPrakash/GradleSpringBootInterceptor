package com.prakash.java.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author prakash.rajendran
 *
 */
@Component
public class ProductInterceptorConfig implements WebMvcConfigurer {

	@Autowired
	ProductInterceptor productInterceptor;

	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(productInterceptor);
	}
}
