package kav.Impl;

import kav.Models.Sale;
import kav.Models.ShippingPolicy;

import java.util.List;

public class PlateauShipping implements ShippingPolicy {
    @Override
    public List<Sale> getShippingCost(List<Sale> salesList) {
        for(Sale sale : salesList){
            if(sale.getPrice() > 50){
                sale.setShipping(0);
            }
            else{
                sale.setShipping(20);
            }
        }
        return salesList;
    }
}
