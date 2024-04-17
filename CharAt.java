import java.util.Scanner;

public class CharAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            System.out.println(character);
        }
    }
}
