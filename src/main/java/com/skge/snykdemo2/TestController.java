package com.skge.snykdemo2;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.regex.Pattern;

@RestController
public class TestController {

    public String test(@RequestParam("regex") String regex) {
        String text = "";
        return Pattern.compile(regex).matcher(text).replaceAll("");
    }

}
