package com.example.converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConverterTests {

    Converter converter = new Converter();


    @Test
    void meterTest() {
        //Arrange
        double a = 2;

        double expectedResult = 2/1.094;

        //Act
        double result = converter.toMeter(a);

        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void centimeterTest() {
        //Arrange
        double a = 2;

        double expectedResult = 2*2.54;

        //Act
        double result = converter.toCentimeter(a);

        //Assert
        assertEquals(expectedResult, result);
    }

}
