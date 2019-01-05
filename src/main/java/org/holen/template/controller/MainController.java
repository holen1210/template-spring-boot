package org.holen.template.controller;

import org.holen.template.common.HttpResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;

/**
 * Created by lvhaolin 2018/11/19
 */

@RestController
public class MainController {

    @GetMapping("/")
    public HttpResult<String> index() {
        return HttpResult.newSuceess("Serve is running...");
    }
}
