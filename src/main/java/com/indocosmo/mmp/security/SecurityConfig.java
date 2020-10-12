package com.indocosmo.mmp.security;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.header.writers.frameoptions.XFrameOptionsHeaderWriter;

@Configuration
@EnableConfigurationProperties
public class SecurityConfig extends WebSecurityConfigurerAdapter {
 
   @Autowired
   SecurityUserDetailsService securityUserDetailsService;
   
   @Autowired
   CustomAuthSuccessHandler customAuthSuccessHandler;
   
   
   @Bean
   public AccessDeniedHandler accessDeniedHandler(){
       return new CustomAccessDeniedHandler();
   }
 
 
   
   @Override
   protected void configure(HttpSecurity http) throws Exception {
    
	   http.csrf().disable().headers()
		.addHeaderWriter(
				new XFrameOptionsHeaderWriter(XFrameOptionsHeaderWriter.XFrameOptionsMode.SAMEORIGIN))
		.and()
		.authorizeRequests().antMatchers("/", "/resources/**").permitAll().and()
		.authorizeRequests().antMatchers("/", "/login", "/logout","/signUp","/confirm-account").permitAll()
		//.antMatchers("/company/**").hasAuthority(ROLE_USER)
		//.antMatchers("/admin").hasAuthority(ROLE_SUPERUSER)
		
		//any request other than mentioned above
		//we can comment this in developing environment
		.anyRequest().authenticated()

		 //configure login form
		.and().formLogin()
	   	.loginPage("/login")
		   .successHandler(customAuthSuccessHandler)
		   .failureUrl("/login?failed")
		   .usernameParameter("email")
		   .passwordParameter("password")
		   
		.and().logout().logoutUrl("/logout").deleteCookies("remember-me").logoutSuccessUrl("/login?logout").permitAll()
		.and().rememberMe();
	   
   }
   
   @Bean
   public PasswordEncoder passwordEncoder() {
	   return new BCryptPasswordEncoder();
   }
   
   @Override
   public void configure(AuthenticationManagerBuilder builder) throws Exception {
    builder.userDetailsService(securityUserDetailsService);
   }
}








