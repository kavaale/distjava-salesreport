package kav.Impl;

import kav.Models.Sale;
import kav.Models.SalesInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleInput implements SalesInput {
    @Override
    public List<Sale> getSales() {
        List<Sale> salesList = new ArrayList<>();
        String customer;
        int x = 1;
        int c = 0;

        Scanner input = new Scanner(System.in);

        while(x == 1) {
            System.out.println("Enter Customer Information");
            Sale sale = new Sale();
            System.out.println("What is the customers name?");
            customer = input.nextLine();
            sale.setCustomer(customer);
            c=0;
            while(c == 0) {
                System.out.println("What country is the customer from?");
                System.out.println("1 for United states, " +
                        "2 for Japan, 3 for Scotland, 4 for India");
                c = Integer.parseInt(input.nextLine());
                if (c == 1) {
                    sale.setCountry("United States");
                }
                else if (c == 2) {
                    sale.setCountry("Japan");
                }
                else if (c == 3) {
                    sale.setCountry("Scotland");
                }
                else if (c == 4) {
                    sale.setCountry("India");
                }
                else {
                    c = 0;
                    System.out.println("Choose a valid number");
                }
            }
            System.out.println("What is the total amount of the purchase?");
            sale.setPrice(Integer.parseInt(input.nextLine()));
            System.out.println("What is the total tax on the purchase?");
            sale.setTax(Integer.parseInt(input.nextLine()));
            salesList.add(sale);
            System.out.println("Add another customer? Press 1 for yes");
            x = Integer.parseInt(input.nextLine());
        }
        return salesList;
    }
}
