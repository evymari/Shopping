package Shopping;

public class FoodProduct extends Product {
   private int discount;
  // public  FoodProduct(String name,double price)
  // {
    //   super(name, price);
   //}
    //public  void applyDiscount(int discount) {
      //  this.discount = discount;}
    //@Override
    //public double getPrice(){
    //    double price = super.getPrice();
     //  double moneyDiscount = price * this.discount /100;

    //}
    public FoodProduct(String name, double price ) {
        super(name, price);

    }

    public void applyDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public double getPrice() {
        double price = super.getPrice();
        double moneyDiscount = price * this.discount /100;


        return price - moneyDiscount;
    }
}
