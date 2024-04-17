import java.util.Scanner;

public class MicrowaveMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cook time-> ");
        String input = scanner.nextLine();

        int length = input.length();
        int minutes;
        int seconds;

        if (length <= 2) {
            seconds = Integer.parseInt(input);
            minutes = 0;
        } else {
            seconds = Integer.parseInt(input.substring(length - 2));
            minutes = Integer.parseInt(input.substring(0, length - 2));
        }

        System.out.println("Your time-> " + minutes + ":" + String.format("%02d", seconds));
    }
}
