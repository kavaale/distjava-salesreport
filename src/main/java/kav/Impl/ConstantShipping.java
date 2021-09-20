package kav.Impl;

import kav.Models.Sale;
import kav.Models.ShippingPolicy;

import java.util.List;

public class ConstantShipping implements ShippingPolicy {

    @Override
    public List<Sale> getShippingCost(List<Sale> salesList){
        for(Sale sale : salesList){
            sale.setShipping(20);
        }
        return salesList;
    }
}
