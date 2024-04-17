import java.util.Scanner;

public class WordTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word --> ");
        String word = scanner.nextLine();

        for (int i = 0; i < word.length(); i++) {
            String modifiedWord = "";
          
            for (int j = 0; j < i; j++)   // Append spaces
                modifiedWord += " ";
          
            modifiedWord += word.substring(i).replaceFirst(".", " ").substring(0, word.length() - i); // Append word with first character replaced by space and last character removed
            System.out.println(modifiedWord);
        }
    }
}
