package product;

import java.math.BigDecimal;

public class Products {
    // for constraints 5 digit upc max
    // real application would differ
    private static Product[] products = new Product[(int)Math.pow(10, 5)];

    public String getProductName(int UPC){
        return products[UPC].getProductName();
    }
    public BigDecimal getProductCost(int UPC){
        return products[UPC].getCost();
    }
}
