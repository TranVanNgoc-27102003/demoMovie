//package com.poly.utils;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig  {
//	
//	@Bean
//	public SecurityFilterChain configure(HttpSecurity httpsecurity) throws Exception{
//		
//		httpsecurity.authorizeHttpRequests(request->
//		request.requestMatchers(HttpMethod.POST,"/login1").permitAll()
//		.anyRequest().authenticated());
//		httpsecurity.csrf(httpsSecurityCsrf -> httpsSecurityCsrf.disable());
//		return httpsecurity.build();
//	}
//}
////
