package com.baijianye.just.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kollice on 2018/4/10.
 */
@Controller
public class LoginController {
    @RequestMapping("/")
    public String index() {
        return "login";
    }

    @PostMapping("/dologin")
    @ResponseBody
    public Map login(@RequestParam String username, @RequestParam String password) {
        Map result = new HashMap<String, Object>();
        result.put("success", true);
        return result;
    }

    @GetMapping("/main")
    public String main() {
        return "/Just/index";
    }
}
