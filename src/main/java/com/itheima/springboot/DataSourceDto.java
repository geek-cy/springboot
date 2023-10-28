package com.itheima.springboot;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ToString
@Component
@ConfigurationProperties(prefix = "datasource")
public class DataSourceDto {
    private String driver;
    private String url;
    private String username;
    private String password;
}
