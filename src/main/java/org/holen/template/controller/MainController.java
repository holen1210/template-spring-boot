package org.holen.template.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lvhaolin 2018/11/19
 */

@RestController
public class MainController {

    @GetMapping("/")
    public String index() {
        return "start!";
    }
}
