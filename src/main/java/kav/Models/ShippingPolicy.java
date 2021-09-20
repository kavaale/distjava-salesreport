package kav.Models;

import java.util.List;

public interface ShippingPolicy {
    List<Sale> getShippingCost(List<Sale> sales);
}
