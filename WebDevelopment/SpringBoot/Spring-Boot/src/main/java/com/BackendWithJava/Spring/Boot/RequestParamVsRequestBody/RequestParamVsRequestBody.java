package com.BackendWithJava.Spring.Boot.RequestParamVsRequestBody;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamVsRequestBody {

    @GetMapping("/getUsingRequestBody")
    public void getuUsingRequestBody(){

    }

    @GetMapping("/getUsingResponseBody")
    public void getuUsingResponseBody(){

    }
}
