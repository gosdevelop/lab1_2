package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType;
import pl.com.bottega.ecommerce.sharedkernel.Money;

/**
 * Created by Konrad Gos on 13.03.2017.
 */
public interface TaxCalculationInterface {
    Tax calculate(ProductType productType, Money net);
}
