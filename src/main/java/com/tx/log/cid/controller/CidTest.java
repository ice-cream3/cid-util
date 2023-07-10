package com.tx.log.cid.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: CidTest
 * @Description:
 * @Author: ice
 * @Date: 2023/7/7 21:58
 */
@RestController
public class CidTest {

    private static final Logger logger = LoggerFactory.getLogger(CidTest.class);

    @RequestMapping("cid")
    public String testLog(String name) {
        logger.info("你好,你好,很高兴见到你:{}", name);
        return "success";
    }
}
