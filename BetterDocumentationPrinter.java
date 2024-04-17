import java.util.Scanner;

public class BetterDocumentationPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean inBlockComment = false;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.contains("/*")) 
                inBlockComment = true;

            if (line.contains("*/")) 
                inBlockComment = false;

            if (inBlockComment || line.startsWith("//") || line.startsWith("/*") || line.startsWith("*/")) 
                System.out.println(line);
        }
    }
}
