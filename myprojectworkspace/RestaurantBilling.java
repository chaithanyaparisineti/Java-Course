package myprojectworkspace;
import java.util.Scanner;
public class RestaurantBilling {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int MainChoice,ItemChoice,Quantity;
	double price=0;
	double totalbill=0;
	double gst,finalbill=0;
	do {
		System.out.println("*********Restaurant Menu*******");
		System.out.println("1.starters");
		System.out.println("2.Desserts");
		System.out.println("3.Drinks");
		System.out.println("4.Generate Bill");
		 MainChoice=sc.nextInt();
		switch(MainChoice) {
		case 1:
			System.out.println("****starters***********");
			System.out.println("1. chicken rools, Rs-50");
			System.out.println("2. chicken manjuriya, Rs-70");
			System.out.println("3. chicken wings , Rs-60");
			System.out.println("4. veg manjuriya, Rs-50");
			System.out.println("5. chicken fry, Rs-100");
			System.out.println("6. french fries, Rs-50");
			
			System.out.println("choose items:");
			ItemChoice=sc.nextInt();
			System.out.println("choose Quantity:");
			Quantity=sc.nextInt();
			switch(ItemChoice) {
			
			case 1:price=50;break;
			case 2:price=70;break;
			case 3:price=60;break;
			case 4:price=50;break;
			case 5:price=100;break;
			case 6:price=50;break;
			default:
				System.out.println("this item is not available!");
				continue;
			}
			totalbill +=price*Quantity;
			System.out.println("AmountAdded= Rs"+(price*Quantity));
			break;
		case 2:
			System.out.println("****Desserts***********");
			System.out.println("1. iceCream, Rs-90");
			System.out.println("2. sweets, Rs-30");
			System.out.println("3. Gulab jaam , Rs-20");
			System.out.println("4. Fruitsalad, Rs-80");
			System.out.println("5. cakes , Rs-40");
			
			System.out.println("choose items:");
			ItemChoice=sc.nextInt();
			System.out.println("choose Quantity:");
			Quantity=sc.nextInt();
			switch(ItemChoice) {
			case 1:price=90;break;
			case 2:price=30;break;
			case 3:price=20;break;
			case 4:price=80;break;
			case 5:price=40;break;
			
			default:
				System.out.println("this item is not available!");
				continue;
			}
			totalbill +=price*Quantity;
			System.out.println("AmountAdded= Rs"+(price*Quantity));
			break;
		case 3:
			System.out.println("****Drinks***********");
			System.out.println("1. Thumpsup, Rs-20");
			System.out.println("2. MilkShake, Rs-50");
			System.out.println("3. sprite , Rs-25");
			System.out.println("4. cococola, Rs-30");
			System.out.println("choose items:");
			ItemChoice=sc.nextInt();
			System.out.println("choose Quantity:");
			Quantity=sc.nextInt();
			switch(ItemChoice) {
			case 1:price=20;break;
			case 2:price=50;break;
			case 3:price=25;break;
			case 4:price=30;break;
			default:
				System.out.println("this item is not available!");
				continue;
			}
			totalbill +=price*Quantity;
			System.out.println("AmountAdded= Rs"+(price*Quantity));
			
			gst=totalbill*0.05;
			finalbill=totalbill+gst;
			System.out.println("********Food Bill**********");
			System.out.println("FoodBill: "+totalbill);
			System.out.println("finalbill: Rs"+finalbill);
			System.out.println("gst: Rs"+gst);
			System.out.println("Thankyou ! Visit Again..!");
			break;
			default:
				System.out.println("Invalid Choice");
				
			
		}
	}while(MainChoice !=5);
	
	sc.close();

	}

}
