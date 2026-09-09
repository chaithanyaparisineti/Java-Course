package oopsConcepts;

public class FoodOrder2 {

	public static void main(String[] args) {
		System.out.println("******Food Order info******");
		System.out.println("---------Pizza-------------");
		FoodOrder F1=new PizzaFO();
		F1.calculatebill();
		F1.delivaryprice();
		System.out.println("---------Burger------");
		FoodOrder F2=new BurgerFO();
		F2.calculatebill();
		F2.delivaryprice();
		System.out.println("---------Biriyani------");
		FoodOrder F3=new BiriyaniFO();
		F3.calculatebill();
		F3.delivaryprice();
		System.out.println("********************");
	}

}
