package oopsConcepts;

public class productInventory2 {

	public static void main(String[] args) {
		productInventory p1=new productInventory();
	p1.setpId(121);
        p1.setpName("shoes");
        p1.setprice(500.00);
        p1.setquantity(10);
       
        System.out.println("product Id:"+p1.getpId());
        System.out.println("product Name:"+p1.getpName());
        System.out.println("product price:"+p1.getprice());
        System.out.println("product quantity:"+p1.getquantity());
        
        p1.addStock(10);
        System.out.println("After adding stock: " + p1.getquantity());

       
        p1.removeStock(5);
        System.out.println("After removing stock: " + p1.getquantity());
   }
	}


