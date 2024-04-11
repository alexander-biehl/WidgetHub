package com.alexanderbiehl.widgethub;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/health-check")
    public boolean healthCheck() {
        return true;
    }
}
