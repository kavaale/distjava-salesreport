package kav;

import kav.Models.Sale;
import kav.Models.SalesInput;
import kav.Models.SalesReport;
import kav.Models.ShippingPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Component
public class RunReport {
    private SalesInput input;
    private SalesReport report;
    private ShippingPolicy shipping;

    private List<Sale> saleList = new ArrayList<>();

    @Autowired
    public RunReport(SalesInput input, SalesReport report, ShippingPolicy shipping){
        this.input = input;
        this.report = report;
        this.shipping = shipping;
    }

    public void run() throws FileNotFoundException {
        saleList = input.getSales();
        saleList = shipping.getShippingCost(saleList);
        report.generateReport(saleList);
    }




}
