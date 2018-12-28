package org.holen.template.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;

/**
 * Created by lvhaolin 2018/11/19
 */

@RestController
public class MainController {

    @GetMapping("/")
    public String index() {
//        RequestContextHolder.getRequestAttributes().setAttribute("Hello", "123122", 0);
        return "start!";
    }

}
