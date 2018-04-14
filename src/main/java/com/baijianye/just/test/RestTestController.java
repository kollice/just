package com.baijianye.just.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kollice on 2018/4/10.
 */
@RestController
public class RestTestController {

    @GetMapping("/testrest")
    public String testrest() {
        return "testrest";
    }
}
