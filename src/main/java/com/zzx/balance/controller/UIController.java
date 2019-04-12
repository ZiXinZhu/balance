package com.zzx.balance.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@Slf4j
public class UIController {

    @GetMapping("/ui")
    public void doui(HttpServletResponse response){
        log.info("============请求UI============");
        try {
            response.sendRedirect("404.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
