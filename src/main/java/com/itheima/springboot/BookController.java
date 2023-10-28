package com.itheima.springboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/book")
public class BookController {

    @Value("${country}")
    private String country;

    @Autowired
    private DataSourceDto dataSourceDto;
    @Autowired
    private Environment env;
    @GetMapping
    public String getById() {
        log.info("{}", env.getProperty("country"));
        log.info("{}", dataSourceDto.toString());
        return country;
    }
}
