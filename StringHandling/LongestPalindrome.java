package StringHandling;
public class LongestPalindrome {
	public static void main(String[] args) {
		String str="malayalam";
		String longest="";
		  for (int i = 0; i < str.length(); i++) {
	            for (int j = i + 1; j <= str.length(); j++) {
	                String sub = str.substring(i, j);
	                String rev = "";
	                for (int k = sub.length() - 1; k >= 0; k--) {
	                    rev = rev + sub.charAt(k);
	                }
	                if (sub.equals(rev) && sub.length() > longest.length()) {
	                    longest = sub;
	                }
	            }
	        }
	        System.out.println("Longest Palindrome: " + longest);
	    }
	}

