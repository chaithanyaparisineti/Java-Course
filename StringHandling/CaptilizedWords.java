package StringHandling;

public class CaptilizedWords {

	public static void main(String[] args) {
		String str="java is awesome";
		String result="";
		boolean capitalize=true;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==' ') {
				capitalize=true;
				result+=ch;
			}else {
				if(capitalize) {
					if(ch>='a'&& ch<='Z') {
						ch=(char)(ch-32);
					}
					capitalize=false;
				}
				result+=ch;
			}
		}
System.out.println(result);
	}

}
