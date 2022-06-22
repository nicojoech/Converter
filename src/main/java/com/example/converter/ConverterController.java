package com.example.converter;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ConverterController {

    @RequestMapping("/meter")
    public double toMeter(@RequestParam double yd){
        return yd / 1.094;
    }

}
