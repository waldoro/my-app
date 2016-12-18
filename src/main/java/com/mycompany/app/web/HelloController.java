package com.mycompany.app.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wrokita on 14/12/2016.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    String home() {
        return "Hello    World! ";
    }
}
