import java.util.*;

public class MobilePhoneDetails {

    public static void main(String[] args) {
        MobilePhone mp1 = new MobilePhone("VIVO", "VIVO V29", 15999.0);
        MobilePhone mp2 = new MobilePhone("ONE PLUS", "ONE PLUS nord4", 39999.0);
        MobilePhone mp3 = new MobilePhone("APPLE", "iphone pro16", 79999.0);
        mp1.print();
        System.out.println("------------------------------");
        mp2.print();
        System.out.println("------------------------------");
        mp3.print();
        System.out.println("------------------------------");
    }
}

class MobilePhone {
    String brand;
    String model;
    double price;

    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void print() {
        System.out.println("Brand of mobile: " + brand);
        System.out.println("Model of mobile: " + model);
        System.out.println("Price of mobile: " + price);
    }
}
