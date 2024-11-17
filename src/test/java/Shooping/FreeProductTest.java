package Shooping;

import Shopping.FreeProduct;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FreeProductTest {
    @Test
    void thePriceOfFreeProductsIsAlwaysZero() {
        // GIVE
        FreeProduct freeProducts = new FreeProduct("some-name");
        double price = freeProducts.getPrice();

                assertEquals(0.0, price);
    }
    @Test
    void thePriceOfFreeProductsHasANameAndAPrice(){
        FreeProduct freeProduct = new FreeProduct("perejil");
        String productName = freeProduct.getName();
        assertEquals("perejil",productName);
    }

    static class BookTest {

    }
}







