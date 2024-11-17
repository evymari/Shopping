package Shopping;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> productList = new ArrayList<>();


    public void addProduct(Product product) {

        this.productList.add(product);
    }
    public List<Product> getProducts() {
        return this.productList;
    }



    public void deleteByName(String name) {
        productList.removeIf(product->product.getName().equals(name));
    }

    public double getTotalPrice() {
        double total = 0;
        for (Product product : productList) {
            total += product.getPrice();
        }
return  total;
    }
}
