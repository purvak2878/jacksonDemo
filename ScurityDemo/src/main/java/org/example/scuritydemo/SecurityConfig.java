package org.example.scuritydemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {

        UserDetails employee = User.builder()
                .username("employee")
                .password("{noop}emp123")
                .roles("EMPLOYEE")
                .build();

        UserDetails manager = User.builder()
                .username("manager")
                .password("{noop}manager123")
                .roles("MANAGER")
                .build();

        UserDetails admin = User.builder()
                .username("admin")
                .password("{noop}admin123")
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(employee, manager, admin);
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .authorizeHttpRequests(auth -> auth

                        .requestMatchers("/").permitAll()

                        .requestMatchers("/employee")
                        .hasRole("EMPLOYEE")

                        .requestMatchers("/manager")
                        .hasRole("MANAGER")

                        .requestMatchers("/admin")
                        .hasRole("ADMIN")

                        .anyRequest()
                        .authenticated()
                )
                .httpBasic(Customizer.withDefaults());

        return http.build();
    }

}
