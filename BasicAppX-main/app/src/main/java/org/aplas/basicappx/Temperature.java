package org.aplas.basicappx;

public class Temperature {
    private double Celsius;

    public Temperature() {
        this.Celsius = 0;
    }

    public void setCelsius(double celsius) {
        this.Celsius = celsius;
    }

    public double getCelsius() {
        return Celsius;
    }

    public double getFahrenheit() {
        return Celsius *9/5+32;
    }

    public void setFahrenheit(double fahrenheit) {
        this.Celsius = (fahrenheit-32)/9*5;
    }

    public double getKelvins() {
        return Celsius +273.15;
    }

    public void setKelvins(double kelvin) {
        this.Celsius = kelvin - 273.15;
    }

    public double convert(String oriUnit, String convUnit, double value){
        switch (oriUnit) {
            case "°C":
                if (convUnit.equals("°F")) {
                    return getFahrenheit();
                } else if (convUnit.equals("K")) {
                    return getKelvins();
                } else {
                    return Celsius;
                }
            case "°F":
                if (convUnit.equals("°C")) {
                    setFahrenheit(value);
                    return getCelsius();
                } else if (convUnit.equals("K")) {
                    setFahrenheit(value);
                    return getKelvins();
                } else {
                    return value;
                }
            case "K":
                if (convUnit.equals("°C")) {
                    setKelvins(value);
                    return getCelsius();
                } else if (convUnit.equals("°F")) {
                    setKelvins(value);
                    return getFahrenheit();
                } else {
                    return value;
                }
            default:
                return getCelsius();
        }
    }
}
