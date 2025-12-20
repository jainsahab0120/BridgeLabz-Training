import java.util.*;

public class CoffeeCounterChronicles {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int typeOfCoffee = 3;
        int gst = 5;
        int amount;
        switch(typeOfCoffee) {
        case 1:
        	amount = 120;
        	System.out.println(totalMoney(amount, gst));
        	break;
        case 2:
            amount = 150;
    	    System.out.println(totalMoney(amount, gst));
    	    break;
        case 3:
        	amount = 200;
    	    System.out.println(totalMoney(amount, gst));
    	    break;
        case 4:
        	amount = 250;
    	    System.out.println(totalMoney(amount, gst));
    	    break;   
        }
	}
	public static String totalMoney(int amount, int gst) {
		double gstAdded = amount * gst / 100.0;
		double total = amount + gstAdded;
		return "The total amount of your coffee is " + total;
	}
}
