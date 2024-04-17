import java.util.Scanner;

public class TitleApplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a name:");
            String name = scanner.nextLine().trim();

            if (name.isEmpty()) 
                break; 

            if (name.startsWith("Amy") || name.startsWith("Buffy") || name.startsWith("Cathy")) {
                System.out.println("Ms. " + name);
            } else if (name.startsWith("Elroy") || name.startsWith("Fred") || name.startsWith("Graham")) {
                System.out.println("Mr. " + name);
            } else 
                System.out.println(name);
        }
    }
}
