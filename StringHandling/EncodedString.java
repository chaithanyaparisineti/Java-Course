package StringHandling;
public class EncodedString {
	public static void main(String[] args) {
		String str="a2b17c3";
		StringBuilder result=new StringBuilder();
		for(int i=0;i<str.length();) {
			char ch=str.charAt(i);
			i++;
			
		StringBuilder num=new StringBuilder();
		while(i<str.length()&&Character.isDigit(str.charAt(i))) {
			num.append(str.charAt(i));
			i++;
		}
		int count=Integer.parseInt(num.toString());
		for(int j=0;j<count;j++) {
			result.append(ch);
			
		}
		}
		System.out.println(result);
	}

}
