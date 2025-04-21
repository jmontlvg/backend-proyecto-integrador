package com.jardinfloral.ecommerce.Config;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
@EnableWebSecurity
public class SegurityConfig {
@Bean
public SecurityFilterChain configure(HttpSecurity http) throws Exception {
	return http.csrf(csrf->csrf.disable())
			.authorizeHttpRequests(auth->auth.anyRequest().permitAll()
					).httpBasic(withDefaults())
			.build();
			
	
}//configure
@Bean
public PasswordEncoder encoder() {
	return new BCryptPasswordEncoder();
}//Encoder
}//Class SegurityConfig
