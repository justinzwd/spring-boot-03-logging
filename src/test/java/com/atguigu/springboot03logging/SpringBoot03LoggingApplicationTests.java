package com.atguigu.springboot03logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot03LoggingApplicationTests {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads() {
        logger.trace("这是trace日志。。。");
        logger.debug("debug。。。");
        logger.info("info日志");
        logger.warn("warn");
        logger.error("error");

    }

}
