package com.example.demo.profile;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("demo.profiles")
@PropertySource(value = "classpath:application.properties")
public class SpringProfilesConfig {

}
