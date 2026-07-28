package myprojectworkspace;

public class productcon {
	int productId;
	String productName;
	int price;
	productcon(int productId,String productName,int price){
		this.productId=productId;
		this.productName=productName;
		this.price=price;
	}
	void show(){
		System.out.println("productId:"+productId);
		System.out.println("productName:"+productName);
		System.out.println("price:"+price);
	}
	public static void main(String[] args) {
		productcon p1=new productcon(1215,"vegetables",200);
		p1.show();
		}

}
