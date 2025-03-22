package com.BackendWithJava.Spring.Boot.RequestParamVsResponseBody;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestBodyVsResponseBody {

    @GetMapping("/getUsingRequestBody")
    public void getuUsingRequestBody(){

    }

    @GetMapping("/getUsingResponseBody")
    public void getuUsingResponseBody(){

    }
}
