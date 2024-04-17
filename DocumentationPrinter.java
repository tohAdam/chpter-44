import java.util.Scanner;

public class DocumentationPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
       
          if (line.startsWith("//")) 
             System.out.println(line);
        }
    }
}
