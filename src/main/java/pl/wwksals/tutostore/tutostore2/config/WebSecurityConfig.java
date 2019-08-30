package pl.wwksals.tutostore.tutostore2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    /**
     *The configure(HttpSecurity) method defines which URL paths should be secured and which should not.
     * Specifically, the "/" and "/home" paths are configured to not require any authentication.
     * All other paths must be authenticated.
     * When a user successfully logs in, they will be redirected to the previously requested page that
     * required authentication. There is a custom "/login" page specified by loginPage(), and everyone is allowed to view it.
     */

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers("/","/home" ,"/register").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin().loginPage("/login").permitAll()
                .and()
                .logout()
                .permitAll();
    }

    /**
     *userDetailsService() method, it sets up an in-memory user store with a single user. That user is given a username
     * of "user", a password of "password", and a role of "USER".
     */

    @Bean
    @Override
    protected UserDetailsService userDetailsService() {
       UserDetails user = User.withDefaultPasswordEncoder()
               .username("januszex")
               .password("januszex")
               .roles("USER")
               .build();
       return new InMemoryUserDetailsManager(user);
    }
}
