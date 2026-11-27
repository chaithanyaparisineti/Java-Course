package StringHandling;
public class ArrangeWordsInOrder {
    public static void main(String[] args) {
        String str = "going4 to3 Hyderabad5 i1 am2";
        String[] words = str.split(" ");
        String[] result = new String[words.length];
        for (String word : words) {
            String number = word.replaceAll("[^0-9]", "");
            String text = word.replaceAll("[0-9]", "");
            int position = Integer.parseInt(number);
            result[position - 1] = text;
        }
        for (String word : result) {
            System.out.print(word + " ");
        }
    }
}
