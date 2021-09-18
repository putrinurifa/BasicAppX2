package org.aplas.basicappx;

public class Distance {
    private double meter;

    public Distance() {
        this.meter = 0;
    }

    public void setMeter(double meter) {
        this.meter = meter;
    }

    public void setInch(double inch) {
        this.meter = inch/39.3701;
    }

    public void setMile(double mile) {
        this.meter = mile/0.000621371;
    }

    public void setFoot(double foot) {
        this.meter = foot/3.28084;
    }

    public double getMeter() {
        return this.meter;
    }

    public double getInch() {
        return meter *39.3701;
    }

    public double getMile() {
        return meter *0.000621371;
    }

    public double getFoot() {
        return meter *3.28084;
    }

    public double convert(String oriUnit, String convUnit, double value) {
        switch (oriUnit) {
            case "Mtr":
                switch (convUnit) {
                    case "Inc":
                        return getInch();
                    case "Mil":
                        return getMile();
                    case "Ft":
                        return getFoot();
                    default:
                        return meter;
                }
            case "Inc":
                switch (convUnit) {
                    case "Mtr":
                        setInch(value);
                        return getMeter();
                    case "Mil":
                        setInch(value);
                        return getMile();
                    case "Ft":
                        setInch(value);
                        return getFoot();
                    default:
                        return value;
                }
            case "Mil":
                switch (convUnit) {
                    case "Mtr":
                        setMile(value);
                        return getMeter();
                    case "Inc":
                        setMile(value);
                        return getInch();
                    case "Ft":
                        setMile(value);
                        return getFoot();
                    default:
                        return value;
                }
            case "Ft":
                switch (convUnit) {
                    case "Mtr":
                        setFoot(value);
                        return getMeter();
                    case "Inc":
                        setFoot(value);
                        return getInch();
                    case "Mil":
                        setFoot(value);
                        return getMile();
                    default:
                        return value;
                }
            default:
                return getMeter();
        }
    }
}
