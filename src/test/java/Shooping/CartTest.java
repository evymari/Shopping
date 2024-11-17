package Shooping;
import Shopping.Cart;
import Shopping.FoodProduct;
import Shopping.FreeProduct;
import Shopping.Product;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartTest {

    @Test
    void canAddAProduct(){
        Cart cart = new Cart();
        FoodProduct foodProduct = new FoodProduct("pizza",10);
       //añadir carrito
        cart.addProduct(foodProduct);
        //them ,ver que el producto
        List<Product> products = cart.getProducts();

        assertEquals(1,products.size());
        assertEquals(foodProduct,products.getFirst());


    }


    @Test
    void canDeleteProductByNamw() {
        Cart cart = new Cart();
        FoodProduct foodProduct = new FoodProduct("pizza",10);
        FreeProduct freeProduct = new FreeProduct("perejil");
        cart.addProduct(foodProduct);
        cart.addProduct(freeProduct);

        cart.deleteByName(foodProduct.getName());
        List<Product> products = cart.getProducts();

        assertEquals(1, products.size());
        assertEquals(freeProduct, products.getFirst());
    }
    @Test
    void canCalculatetotalPiceWithDiscounts() {
        Cart cart = new Cart();
        FoodProduct pizza = new FoodProduct("pizza",10);
        Product shawarma = new FoodProduct("shawarma",40);

        pizza.applyDiscount(50);

        cart.addProduct(pizza);
        cart.addProduct(shawarma);
        double totalPrice = cart.getTotalPrice();
        assertEquals(45,totalPrice);
    }


}
