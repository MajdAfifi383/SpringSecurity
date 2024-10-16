package SpringSecurity.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration

public class ProjectSecurityConfig {
@Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity httpSecurity)throws  Exception{
        httpSecurity
                .authorizeHttpRequests(authorizeRequests->authorizeRequests
                        .requestMatchers("/api/v1/customer/customerdetails","/api/v1/employee/employeedetails").authenticated()
                        .requestMatchers("/api/v1/task/taskdetails").permitAll()
                )
                .formLogin()
                .and()
                .httpBasic();
    return httpSecurity.build();
    }

}
