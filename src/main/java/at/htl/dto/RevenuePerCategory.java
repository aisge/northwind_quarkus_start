package at.htl.dto;

import java.math.BigDecimal;

public class RevenuePerCategory {
    private String categoryname;
    private double revenue;

    public RevenuePerCategory(String categoryname, double revenue) {
        this.categoryname = categoryname;
        this.revenue = revenue;
    }

    public RevenuePerCategory(String categoryname, BigDecimal revenue) {
        this.categoryname = categoryname;
        this.revenue = revenue.doubleValue();
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }
}
