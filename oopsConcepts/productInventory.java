package oopsConcepts;

public class productInventory {
	private int pId;
	private String pName;
	private double price;
	private int quantity;
	
	public void setpId(int pId) {
		this.pId=pId;
	}
	 public int getpId() {
	        return pId;
	    }
    public void setpName(String pName) {
    	    this.pName=pName;
    }
    public String getpName() {
      	return pName;
    }
    public void setprice(double price) {
    	if(price>=0) {
	    this.price=price;
    }else {
    	System.out.println("price cannot be negative");
    }
}
    public double getprice() {
  	    return price;
}
    public void setquantity(int quantity) {
     	if(quantity>=0) {
    		this.quantity=quantity;
    	}else {
    		System.out.println("quality cannot be negative");
    	}
}
    public int getquantity() {
  	    return quantity;
}
    public void addStock(int quantity) {
    	
		if(quantity>0) {
			this.quantity+=quantity;	
    	}else {
    		System.out.println("Quantity must be positive");
    	}
    }
		public void removeStock(int quantity) {
	    	
			if(quantity>0 && quantity<=this.quantity) {
				this.quantity-=quantity;	
	    	}else {
	    		System.out.println("invalid quantity");
	    	}	
    }
		
}
