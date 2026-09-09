package oopsConcepts;

 class PizzaFO implements FoodOrder{
double itemprice=199;
double delivarycharges=50;
double totalbill;
	@Override
	public void calculatebill() {
		totalbill=itemprice+delivarycharges;
		System.out.println(totalbill);		
	}
	@Override
	public void delivaryprice() {
		System.out.println(delivarycharges);
	}
}
 class BurgerFO implements FoodOrder{
	 double itemprice=149;
	 double delivarycharges=20;
	 double totalbill;
	 	@Override
	 	public void calculatebill() {
	 		totalbill=itemprice+delivarycharges;
	 		System.out.println(totalbill);		
	 	}
	 	@Override
	 	public void delivaryprice() {
	 		System.out.println(delivarycharges);
	 	}
	 }
 class BiriyaniFO implements FoodOrder{
	 double itemprice=180;
	 double delivarycharges=30;
	 double totalbill;
	 	@Override
	 	public void calculatebill() {
	 		totalbill=itemprice+delivarycharges;
	 		System.out.println(totalbill);		
	 	}
	 	@Override
	 	public void delivaryprice() {
	 		System.out.println(delivarycharges);
	 	}
	 }
