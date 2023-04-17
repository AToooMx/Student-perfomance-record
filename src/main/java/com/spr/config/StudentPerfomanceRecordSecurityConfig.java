package com.spr.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class StudentPerfomanceRecordSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.inMemoryAuthentication()
		.withUser("Ruslan")
		.password("{bcrypt}$2a$10$g9FWW1VOwfeygFq/CGvKUexX6gisoGs8dWW1I/kMp2kCqFqBurS1q")
		.roles("admin");
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
		.antMatchers("/homePage")
		.authenticated()
		.antMatchers("/MyLogin")
		.permitAll()
			.and().formLogin().loginPage("/MyLogin").loginProcessingUrl("/proccess-login")
			.and().httpBasic()
			.and().logout();
	}
}
