package AdditionPrograms;

public class MostFrequentChar {

	public static void main(String[] args) {
		 String s="aabbcchowaad";

	        int max=0;
	        char ans=' ';

	        for(int i=0;i<s.length();i++){

	            int count=0;

	            for(int j=0;j<s.length();j++){

	                if(s.charAt(i)==s.charAt(j))
	                    count++;
	            }

	            if(count>max){

	                max=count;
	                ans=s.charAt(i);
	            }
	        }

	        System.out.println("Most Frequent Character : "+ans);

	        for(int i=0;i<s.length();i++){

	            if(s.charAt(i)==ans)
	                System.out.print(i+" ");
	        }
	}

}
