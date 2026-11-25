package StringHandling;
public class CompressRepeatingCharacters {
    public static void main(String[] args) {
        String str = "aabbbbbbbbbbbbbbcccc";
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result.append(str.charAt(i));
                result.append(count);
                count = 1;
            }
        }
        System.out.println("Original String: " + str);
        System.out.println("Compressed String: " + result);
    }
}
