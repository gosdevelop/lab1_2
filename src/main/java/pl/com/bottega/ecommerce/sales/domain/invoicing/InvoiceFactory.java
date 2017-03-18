package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;

/**
 * Created by Konrad Gos on 13.03.2017.
 */

public class InvoiceFactory {

    public Invoice create(ClientData client){
        Invoice invoice = new Invoice(client);

        return invoice;
    }
}