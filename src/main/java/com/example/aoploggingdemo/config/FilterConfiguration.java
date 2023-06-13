package com.example.aoploggingdemo.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.aoploggingdemo.filter.MessageFilter;
import com.example.aoploggingdemo.filter.StudentFilter;

@Configuration
public class FilterConfiguration {

	@Bean
	public FilterRegistrationBean<MessageFilter> registrationBean() {
		FilterRegistrationBean<MessageFilter> registrationBean = new FilterRegistrationBean<MessageFilter>();
		registrationBean.setFilter(new MessageFilter());
		registrationBean.addUrlPatterns("/message/*");
		return registrationBean;
	}
	
	@Bean
	public FilterRegistrationBean<StudentFilter> StudentregistrationBean() {
		FilterRegistrationBean<StudentFilter> StudentregistrationBean = new FilterRegistrationBean<StudentFilter>();
		StudentregistrationBean.setFilter(new StudentFilter());
		StudentregistrationBean.addUrlPatterns("/students/*");
		return StudentregistrationBean;
	}
}
 