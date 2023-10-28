package com.itheima.springboot;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootTest
@Slf4j
class SpringbootApplicationTests {

    @Value("${country}")
    private String country;

    @Autowired
    private DataSourceDto dataSourceDto;
    @Autowired
    private Environment env;
    @Test
    void contextLoads() {
        log.info("{}", env.getProperty("country"));
        log.info("{}", dataSourceDto.toString());
    }


}
