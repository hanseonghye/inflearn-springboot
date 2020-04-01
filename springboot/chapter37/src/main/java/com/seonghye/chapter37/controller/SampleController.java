package com.seonghye.chapter37.controller;

import com.seonghye.chapter37.AppError;
import com.seonghye.chapter37.SampleException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {
    @GetMapping("/hello")
    public String hello(Model model) {
        throw new SampleException();
    }


    //SampleException.class 를 다루는 Exception Handler
    @ExceptionHandler({SampleException.class})
    public @ResponseBody AppError sampleError(SampleException e) {
        AppError appError = new AppError();
        appError.setMessage("error.app.key");
        appError.setReason("Idon`tKnow");
        return appError;
    }
}
