package kav;

import kav.Impl.*;
import kav.Models.SalesInput;
import kav.Models.SalesReport;
import kav.Models.ShippingPolicy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("kav")
public class AppConfig {
    @Bean
    public SalesInput salesInput() {
        return new FileInput();
    }

    @Bean
    public SalesReport salesReport() {
        return new DetailReport();
    }

    @Bean
    public ShippingPolicy shippingPolicy() {
        return new ConstantShipping();
    }


}
