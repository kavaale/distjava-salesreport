package kav.Impl;

import kav.Models.Sale;
import kav.Models.SalesReport;

import java.util.List;

public class CountryReport implements SalesReport {
    @Override
    public void generateReport(List<Sale> salesList) {
        double[] amountHolder = new double[12];

        for (Sale sale : salesList){
            if (sale.getCountry().contains("United States")){
                amountHolder[0] += sale.getPrice();
                amountHolder[1] += sale.getTax();
                amountHolder[2] += sale.getShipping();
            }
            if (sale.getCountry().contains("India")){
                amountHolder[3] += sale.getPrice();
                amountHolder[4] += sale.getTax();
                amountHolder[5] += sale.getShipping();
            }
            if (sale.getCountry().contains("Japan")){
                amountHolder[6] += sale.getPrice();
                amountHolder[7] += sale.getTax();
                amountHolder[8] += sale.getShipping();
            }
            if (sale.getCountry().contains("Scotland")){
                amountHolder[9] += sale.getPrice();
                amountHolder[10] += sale.getTax();
                amountHolder[11] += sale.getShipping();
            }
        }
        System.out.println("COUNTRY REPORT");
        System.out.printf("%-15s %-10s %-10s %-10s\n", "Country", "Amount", "Tax", "Shipping");
        System.out.printf("%-15s %-10s %-10s %-10s\n", "United States", amountHolder[0], amountHolder[1], amountHolder[2]);
        System.out.printf("%-15s %-10s %-10s %-10s\n", "India", amountHolder[3], amountHolder[4], amountHolder[5]);
        System.out.printf("%-15s %-10s %-10s %-10s\n", "Japan", amountHolder[6], amountHolder[7], amountHolder[8]);
        System.out.printf("%-15s %-10s %-10s %-10s\n", "Scotland", amountHolder[9], amountHolder[10], amountHolder[11]);
    }
}


