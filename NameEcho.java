import java.util.Scanner;

public class NameEcho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String fullName = scanner.nextLine().trim();

        int spaceIndex = fullName.indexOf(' ');

        if (spaceIndex > 0) {
            String firstName = fullName.substring(0, spaceIndex);
            String lastName = fullName.substring(spaceIndex + 1).toUpperCase();
            System.out.println(firstName + " " + lastName);
        } else 
            System.out.println(fullName);
    }
}
