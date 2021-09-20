package kav.Impl;

import kav.Models.Sale;
import kav.Models.SalesInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileInput implements SalesInput {
    @Override
    public List<Sale> getSales() throws FileNotFoundException {
        List<Sale> salesList = new ArrayList<>();


        File readMe = new File("src/main/java/kav/sales.txt");
        Scanner reader = new Scanner(readMe);
        String line;
        while(reader.hasNextLine()){
            Sale sale = new Sale();
            line = reader.nextLine();
            String[] lineArray = line.split(",");
            sale.setCustomer(lineArray[0]);
            sale.setCountry(lineArray[1]);
            sale.setPrice(Double.parseDouble(lineArray[2]));
            sale.setTax(Double.parseDouble(lineArray[3]));
            salesList.add(sale);
        }
        return salesList;
    };
}
