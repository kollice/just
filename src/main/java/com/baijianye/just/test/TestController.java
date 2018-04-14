package com.baijianye.just.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kollice on 2018/4/10.
 */
@Controller
public class TestController {
    @RequestMapping("/testpage")
    public String testpage() {
        return "index";
    }
}
