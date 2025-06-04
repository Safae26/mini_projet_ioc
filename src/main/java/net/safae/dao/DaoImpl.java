package net.safae.dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao {
    @Override
    public double getTauxConversion(String from, String to) {
        if (from.equalsIgnoreCase("C") && to.equalsIgnoreCase("F")) {
            return 1.8; // Celsius to Fahrenheit multiplier
        } else if (from.equalsIgnoreCase("F") && to.equalsIgnoreCase("C")) {
            return 5.0/9; // Fahrenheit to Celsius multiplier
        } else if (from.equalsIgnoreCase("C") && to.equalsIgnoreCase("K")) {
            return 1; // Celsius to Kelvin (just needs addition)
        }
        throw new IllegalArgumentException("Conversion non supportée");
    }
}
