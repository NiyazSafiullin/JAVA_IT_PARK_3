package ru.itpark.callcenter.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import ru.itpark.callcenter.controllers.MainPageController;
import javax.sql.DataSource;

// / WebSecurityConfigurerAdapter - класс
// переопределение методов которого позволяет
// настроить безопасность
@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private DataSource dataSource;
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests() // блок, отвечающий за урлы и их доступы
                .antMatchers("/registration/**").permitAll() // разрешили всем
                .antMatchers("/registrationClients/**").hasAnyAuthority("USER")
                .antMatchers("/confirm/**").permitAll()
                .antMatchers("/css/**").permitAll()
                .antMatchers("/addServices/**").hasAnyAuthority("ADMIN", "USER")
                .antMatchers("/js/**").permitAll()
                .antMatchers("/ionicons/**").permitAll()
                .antMatchers("/img/**").permitAll()
                .antMatchers("/css/**").permitAll()
                .antMatchers("/html/**").permitAll()
                .antMatchers("/profile/**").hasAnyAuthority("USER", "ADMIN") // разрешили админу и пользователям
                .antMatchers("/users/**").hasAnyAuthority("USER", "ADMIN") // только админу и пользователю
                .antMatchers("/clients/1").hasAnyAuthority("ADMIN")
                .anyRequest().authenticated() // все остальные запросы требуют предварительной авторизации
                .and()
                .formLogin() // блок с формой входа
                .loginPage("/login")
                .usernameParameter("email")
                .passwordParameter("password")
               .defaultSuccessUrl("/profile")
                .failureUrl("/login?error=true")
                .permitAll()
                .and()
                .logout()
                .logoutUrl("/logout")
                .and()
                .rememberMe().rememberMeParameter("remember-me")
                .tokenRepository(persistentTokenRepository())
                .alwaysRemember(true)
                .tokenValiditySeconds(86400)
                .and()
                .csrf().disable();

    }
    @Bean
    public PersistentTokenRepository persistentTokenRepository() {
        JdbcTokenRepositoryImpl tokenRepository =
                new JdbcTokenRepositoryImpl();
        tokenRepository.setDataSource(dataSource);
        return tokenRepository;
    }

    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    }
}