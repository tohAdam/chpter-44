import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your password:");
            String password = scanner.nextLine();

            if (isAcceptable(password)) {
                System.out.println("Acceptable password.");
                break;
            } else 
                System.out.println("That password is not acceptable.");
        }
    }

    public static boolean isAcceptable(String password) {  // Check if password is at least 7 characters long
        if (password.length() < 7) 
            return false;

        boolean hasUpperCase = false;  // Check if password contains both upper and lower case alphabetic characters
        boolean hasLowerCase = false;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) 
                hasUpperCase = true;
             else if (Character.isLowerCase(ch)) 
                hasLowerCase = true;
        }
        if (!hasUpperCase || !hasLowerCase) {
            return false;
        }

        boolean hasDigit = false; // Check if password contains at least 1 digit
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit) 
            return false;
      
        return true;  // If all conditions are met, the password is acceptable
    }
}
