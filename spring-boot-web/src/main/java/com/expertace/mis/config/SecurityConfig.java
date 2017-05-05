package com.expertace.mis.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	
	 @Autowired public void configureGlobal(AuthenticationManagerBuilder auth)
	 throws Exception {
	 auth.inMemoryAuthentication().withUser("mkyong").password("123456").roles
	 ("USER"); }
	 
	/*@Autowired
	private CustomAuthenticationProvider customAuthenticationProvider;

	@Autowired
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(this.customAuthenticationProvider);
	}

	// .csrf() is optional, enabled by default, if using
	// WebSecurityConfigurerAdapter constructor
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/*").access("hasRole('ROLE_USER')").and().formLogin()
				.loginPage("/login").failureUrl("/login?error").usernameParameter("username")
				.passwordParameter("password")

				.and().logout().logoutSuccessUrl("/login?logout").and().csrf();
	}*/
}