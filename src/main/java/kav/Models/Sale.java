package kav.Models;

public class Sale {
    private String customer;
    private String country;
    private double price;
    private double tax;
    private double shipping;

    public double getShipping() {
        return shipping;
    }

    public void setShipping(double shipping) {
        this.shipping = shipping;
    }

    public String getCustomer() {
        return customer;
    }

    public String getCountry() {
        return country;
    }

    public double getPrice() {
        return price;
    }

    public double getTax() {
        return tax;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
}
