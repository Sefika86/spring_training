package com.cydeo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


@Data //(getter,setter, toString, ALlArgsCons)???
@Configuration //instead of @Component @Configuration works as well
public class AppConfigData {

    @Value("${username}")
    private String userName;

    @Value("${password}")
    private String password;

    @Value("${url}")
    private String url;

}

//another way we dont need this @value anymore==> look at the DBConfigData class