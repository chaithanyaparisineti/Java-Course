package Weekendcases;
import java.util.Scanner;
public class FoodDelivery {

	public static void main(String[] args) {
	int Mainchoice, Itemchoice, Quantity;
    int price = 0;
    String item = "";
    String yn;
   Scanner sc = new Scanner(System.in);

 do {
     System.out.println("******** MAIN MENU ********");
     System.out.println("1. Veg Items");
     System.out.println("2. Non-Veg Items");
     System.out.println("3. Beverages");
     System.out.print("Enter your choice: ");
     Mainchoice = sc.nextInt();
     
 do {
    switch (Mainchoice) {
    case 1:
        System.out.println("**** Veg Items ****");
        System.out.println("1. Paneer Biryani - Rs.200");
        System.out.println("2. Veg Burger - Rs.120");
        System.out.println("3. Veg Pizza - Rs.250");
        System.out.print("Choose Item: ");
        Itemchoice = sc.nextInt();

        System.out.print("Enter Quantity: ");
        Quantity = sc.nextInt();

        switch (Itemchoice) {
        case 1:
            item = "Paneer Biryani";
            price = 200;
            break;
        case 2:
            item = "Veg Burger";
            price = 120;
            break;
        case 3:
            item = "Veg Pizza";
            price = 250;
            break;
        default:
            System.out.println("Item not available!");
            item = "";
            price = 0;
        }

        if (price != 0) {
            System.out.println("Item : " + item);
            System.out.println("Price : Rs." + price);
            System.out.println("Quantity : " + Quantity);
        }
        break;
        case 2:

            System.out.println("**** Non-Veg Items ****");
            System.out.println("1. Chicken Biryani - Rs.300");
            System.out.println("2. Chicken Burger - Rs.180");
            System.out.println("3. Chicken Pizza - Rs.350");
            System.out.print("Choose Item: ");
            Itemchoice = sc.nextInt();

            System.out.print("Enter Quantity: ");
            Quantity = sc.nextInt();

            switch (Itemchoice) {
            case 1:
                item = "Chicken Biryani";
                price = 300;
                break;
            case 2:
                item = "Chicken Burger";
                price = 180;
                break;
            case 3:
                item = "Chicken Pizza";
                price = 350;
                break;
            default:
                System.out.println("Item not available!");
                item = "";
                price = 0;
            }

            if (price != 0) {
                System.out.println("Item : " + item);
                System.out.println("Price : Rs." + price);
                System.out.println("Quantity : " + Quantity);
            }
            break;
    case 3:
    	System.out.println("**** Beverages ****");
        System.out.println("1. Tea - Rs.20");
        System.out.println("2. Coffee - Rs.50");
        System.out.println("3. Juice - Rs.80");
        System.out.print("Choose Item: ");
        Itemchoice = sc.nextInt();

        System.out.print("Enter Quantity: ");
        Quantity = sc.nextInt();

        switch (Itemchoice) {
        case 1:
            item = "Tea";
            price = 20;
            break;
        case 2:
            item = "Coffee";
            price = 50;
            break;
        case 3:
            item = "Juice";
            price = 80;
            break;
        default:
            System.out.println("Item not available!");
            item = "";
            price = 0;
        }

        if (price != 0) {
            System.out.println("Item : " + item);
            System.out.println("Price : Rs." + price);
            System.out.println("Quantity : " + Quantity);
        }
        break;
default:
	 System.out.println("Invalid Main Menu Choice.");
	 }
    System.out.print("\nDo you want to order another item? (y/n): ");
    yn = sc.next();
 } while (yn.equalsIgnoreCase("y"));
 System.out.print("\nDo you want to return to Main Menu? (y/n): ");
 yn = sc.next();
 } while (yn.equalsIgnoreCase("y"));
	 System.out.println("\nThank You! Visit Again.");

 sc.close();
}
}

