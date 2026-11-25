package StringHandling;
public class LongestAndSecondLongest {
    public static void main(String[] args) {
        String str = "I love programming and debugging";
        String[] words = str.split(" ");
        String longest = "";
        String secondLongest = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                secondLongest = longest;
                longest = words[i];
            } 
            else if (words[i].length() > secondLongest.length()
                    && !words[i].equals(longest)) {

                secondLongest = words[i];
            }
        }
        System.out.println("Longest Word: " + longest + " (" + longest.length() + ")");
        System.out.println("Second Longest Word: " + secondLongest+ " (" + secondLongest.length() + ")");
    }
}
