package com.example.converter;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ConverterController {

    Converter converter = new Converter();

    @RequestMapping("/meter")
    public double toMeter(@RequestParam double yd){
        return converter.toMeter(yd);
    }

    @RequestMapping("/centimeter")
    public double toCentimeter(@RequestParam double in){
        return converter.toCentimeter(in);
    }

}
