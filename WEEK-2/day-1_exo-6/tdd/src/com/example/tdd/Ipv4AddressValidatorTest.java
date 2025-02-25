package com.example.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Ipv4AddressValidatorTest {

    Ipv4AddressValidator validator;

    @BeforeEach
    void setUp() {
        validator = new Ipv4AddressValidator();
    }

    @ParameterizedTest
    @CsvSource({
            "1.1.1.1, true",
            "192.168.1.1, true",
            "10.0.0.1, true",
            "127.0.0.1, true",
            "0.0.0.0, false",
            "255.255.255.255, false",
            "1.1.1.0, false",
            "10.0.1, false",
            "10.0..1, false",
            "10.0.AQ.1, false",
            "10.0.-5.1, false",
            "10.0.355.1, false",
    })
    void testValidate(String ip, String expected) {
        Boolean result = validator.validate(ip);
        assertEquals(result, Boolean.valueOf(expected));
    }
}