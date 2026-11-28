package StringHandling;

public class ChangingOrder {

	public static void main(String[] args) {
		String str="a1b2c3d";
		String letters="";
		String digits="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				digits=digits+ch;
			}else {
				letters=letters+ch;
			}
		}
		String result=letters+digits;
		System.out.println("orginal order:"+str);
		System.out.println("Changed order:"+result);
	}

}
