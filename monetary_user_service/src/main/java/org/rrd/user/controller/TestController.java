package org.rrd.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 25169 on 2020/5/22.
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "测试代码aaa";
    }

}
