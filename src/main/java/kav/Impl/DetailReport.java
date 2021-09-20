package kav.Impl;

import kav.Models.Sale;
import kav.Models.SalesReport;

import java.util.List;

public class DetailReport implements SalesReport {
    @Override
    public void generateReport(List<Sale> salesList) {
        System.out.println("SALES DETAIL REPORT");
        System.out.printf("%-20s %-15s %-10s %-10s %-10s\n", "Name", "Country", "Amount", "Tax", "Shipping");
        for(Sale sale : salesList){
            System.out.printf("%-20s %-15s %-10s %-10s %-10s\n", sale.getCustomer(), sale.getCountry(), sale.getPrice(), sale.getTax(), sale.getShipping());
        }

    }
}
