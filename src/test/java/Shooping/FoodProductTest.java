package Shooping;

import Shopping.FoodProduct;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FoodProductTest {
    @Test
    void  foodProductHasNameAndPrice(){
       FoodProduct foodProduct = new FoodProduct("zanahoria", 1);
       double price = foodProduct.getPrice();
       String name = foodProduct.getName();

       assertEquals(1,price);
       assertEquals("zanahoria",name);
    }

    @Test
    void foodProductHasNameAndDiscount(){
        FoodProduct foodProduct = new FoodProduct("some", 100);
        foodProduct.applyDiscount(30);
        double price = foodProduct.getPrice();

        assertEquals(70,price);
    }

}