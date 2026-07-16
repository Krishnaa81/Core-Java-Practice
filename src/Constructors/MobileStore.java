package Constructors;

public class MobileStore {

    String brand;
    String model;
    double price;

    MobileStore() {
        brand = "Samsung";
        model = "A35";
        price = 30000;
    }

    MobileStore(String brand,String model,double price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }

    void displayMobile(){
        System.out.println(brand+" "+model+" "+price);
    }

    void applyDiscount(double discount){
        price = price - discount;
        System.out.println("Price after Discount : "+price);
    }

    public static void main(String[] args) {

        MobileStore m = new MobileStore();
        m.displayMobile();
        m.applyDiscount(2000);
    }
}