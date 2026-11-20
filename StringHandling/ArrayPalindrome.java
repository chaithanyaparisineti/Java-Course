package StringHandling;

public class ArrayPalindrome {
	public static void main(String[] args) {
		String[]arr= {"madam","hello","civic"};
		for(String str:arr) {
			String rev="";
			for(int i=str.length()-1;i>=0;i--) {
				rev=rev+str.charAt(i);
			}
				if(str.equals(rev)) {
					System.out.println(str+" is a palindrome");
				}else {
					System.out.println(str+" is not a palindrome");
				}
			}
	}
}