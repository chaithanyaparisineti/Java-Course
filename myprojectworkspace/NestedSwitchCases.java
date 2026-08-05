package myprojectworkspace;
import java.util.Scanner;
public class NestedSwitchCases {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int quantity, itemChoice;
    double price = 0;
    double totalBill = 0;
    double gst, finalBill;
    String yn;
    int final1=1;
do {
     System.out.println("******** Sai Srinivasa Restaurant ********");
	 System.out.println("1. FoodItems");
     System.out.println("2. Desserts");
     System.out.println("3. CoolDrinks");
	 System.out.print("Enter Menu (fooditems/desserts/cooldrinks): ");
     String menu = sc.next().toLowerCase();
      switch (menu) {
	  case "fooditems" -> {
       do {
    	   System.out.println("\n------ Food Items ------");
           System.out.println("1. Biriyani      - Rs.150");
           System.out.println("2. Veg Meals     - Rs.100");
           System.out.println("3. Gobi Rice     - Rs.80");
           System.out.println("4. Chicken Rice  - Rs.60");
           System.out.println("5. Fish Fry      - Rs.50");
           System.out.println("6. Egg Rice      - Rs.100");
           System.out.println("7. Chicken Fry   - Rs.70");
           System.out.println("8. Paneer Curry  - Rs.50");
           System.out.print("Choose Item: ");
           itemChoice = sc.nextInt();
           System.out.print("Enter Quantity: ");
           quantity = sc.nextInt();
           switch (itemChoice) {
               case 1 -> price = 150;
               case 2 -> price = 100;
               case 3 -> price = 80;
               case 4 -> price = 60;
               case 5 -> price = 50;
               case 6 -> price = 100;
               case 7 -> price = 70;
               case 8 -> price = 50;
               default -> {
                   System.out.println("Invalid Item!");
                   price = 0;
               }
           }
           totalBill += price * quantity;
           System.out.println("Amount Added = Rs." + (price * quantity));
           System.out.print("Do you want to order another item? (y/n): ");
           yn = sc.next();
       } while (yn.equalsIgnoreCase("y"));
       gst = totalBill * 0.05;
       finalBill = totalBill + gst;
       System.out.println("\n******** BILL ********");
       System.out.println("Food Bill : Rs." + totalBill);
       System.out.println("GST (5%)  : Rs." + gst);
       System.out.println("Final Bill: Rs." + finalBill);
       System.out.println("Thank You! Visit Again.");
   }
	   case "desserts" -> {
		   do {
			   System.out.println("\n------ Desserts ------");
               System.out.println("1. Ice Cream    - Rs.80");
               System.out.println("2. Sweets       - Rs.40");
               System.out.println("3. Gulab Jamun  - Rs.30");
               System.out.println("4. Cake         - Rs.50");
               System.out.println("5. Fruit Salad  - Rs.70");
               System.out.println("6. Payasam      - Rs.60");

               System.out.print("Choose Item: ");
               itemChoice = sc.nextInt();

               System.out.print("Enter Quantity: ");
               quantity = sc.nextInt();

               switch (itemChoice) {
                   case 1 -> price = 80;
                   case 2 -> price = 40;
                   case 3 -> price = 30;
                   case 4 -> price = 50;
                   case 5 -> price = 70;
                   case 6 -> price = 60;
                   default -> {
                       System.out.println("Invalid Item!");
                       price = 0;
                   }
               }
               totalBill += price * quantity;
               System.out.println("Amount Added = Rs." + (price * quantity));

               System.out.print("Do you want to order another item? (y/n): ");
               yn = sc.next();

           } while (yn.equalsIgnoreCase("y"));

           gst = totalBill * 0.05;
           finalBill = totalBill + gst;

           System.out.println("\n******** BILL ********");
           System.out.println("Dessert Bill : Rs." + totalBill);
           System.out.println("GST (5%)     : Rs." + gst);
           System.out.println("Final Bill   : Rs." + finalBill);
           System.out.println("Thank You! Visit Again.");
       }

	   
       case "cooldrinks" -> {
    	   do {

               System.out.println("\n------ Cool Drinks ------");
               System.out.println("1. Thums Up      - Rs.30");
               System.out.println("2. Coca Cola     - Rs.22");
               System.out.println("3. Mountain Dew  - Rs.25");
               System.out.println("4. Lemon Soda    - Rs.20");
               System.out.println("5. Fruit Mix     - Rs.30");
               System.out.println("6. Sprite        - Rs.45");
               System.out.print("Choose Item: ");
               itemChoice = sc.nextInt();

               System.out.print("Enter Quantity: ");
               quantity = sc.nextInt();
               switch (itemChoice) {
                   case 1 -> price = 30;
                   case 2 -> price = 22;
                   case 3 -> price = 25;
                   case 4 -> price = 20;
                   case 5 -> price = 30;
                   case 6 -> price = 45;
                   default -> {
                       System.out.println("Invalid Item!");
                       price = 0;
                   }
   }
       totalBill += price * quantity;
        System.out.println("Amount Added = Rs." + (price * quantity));

        System.out.print("Do you want to order another item? (y/n): ");
        yn = sc.next();

           } while (yn.equalsIgnoreCase("y"));

           gst = totalBill * 0.05;
           finalBill = totalBill + gst;

           System.out.println("\n******** BILL ********");
           System.out.println("Drink Bill : Rs." + totalBill);
           System.out.println("GST (5%)   : Rs." + gst);
           System.out.println("Final Bill : Rs." + finalBill);
           System.out.println("Thank You! Visit Again.");
       }

       default -> System.out.println("Invalid Menu!");
       
      }
      System.out.print("do you want to continue for yes ->1, for no->0" );
      int final2=sc.nextInt();
      if(final2 == 1) {
   	    final1 = 1;
   	}
   	else if(final2 == 0) {
   	    final1 = 0;
   	    System.out.println("Thank You! Visit Again.");
   	}
   	else {
   	    System.out.println("Invalid Choice!");
   	    final1 = 0;
   	}
} while(final1==1);
   sc.close();
	}
}






		         
		                   


		            

		               