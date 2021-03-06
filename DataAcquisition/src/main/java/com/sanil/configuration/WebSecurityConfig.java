package com.sanil.configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig  extends WebSecurityConfigurerAdapter

{
	private static final Logger LOGGER = LogManager.getLogger(WebSecurityConfig.class);

	
	  protected void configure(final HttpSecurity http) throws Exception
	  { LOGGER.info("Started");
	  
	  http.csrf().disable();
	  
	  http .headers().frameOptions().disable() .and() .authorizeRequests()
	  .antMatchers("/**").permitAll() 
		/*
		 * .and() .logout() .logoutUrl("/logout") .addLogoutHandler(logoutHandler()) //
		 * .deleteCookies("JSESSIONID","AdminSessionCookie-0","AdminSessionCookie-1",
		 * "AdminSessionCookie-3") .invalidateHttpSession(true)
		 */
	  
	  
	  ;
	  
	  }
	 

}
