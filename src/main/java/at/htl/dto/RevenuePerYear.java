package at.htl.dto;

import java.math.BigDecimal;

public class RevenuePerYear {
    private int year;
    private double value;

    public RevenuePerYear(int year, BigDecimal value) {
        this.year = year;
        this.value = value.doubleValue();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}