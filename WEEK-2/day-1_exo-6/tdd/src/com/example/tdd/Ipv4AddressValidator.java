package com.example.tdd;

public class Ipv4AddressValidator {
    public boolean validate(String ip) {
        String[] octets = ip.split("\\.");
        Integer value = null;
        if (octets.length != 4) {
            return false;
        }
        for (String octet : octets) {
            if (octet.isEmpty()) {
                return false;
            }
            try {
                value = Integer.parseInt(octet);
            } catch (NumberFormatException e) {
                return false;
            }

            if (value < 0 || value > 255) {
                return false;
            }
        }
        return value != 0 && value != 255;
    }
}

