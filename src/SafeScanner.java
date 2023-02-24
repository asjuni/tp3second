import java.util.Scanner;


public class SafeScanner {

    private Scanner scanner;

    public SafeScanner() {
        scanner = new Scanner(System.in);
    }

    public int nextInt() {
        while(!scanner.hasNextInt()) {
            System.out.println("Please enter an integer");
            scanner.nextLine();
        }
        return scanner.nextInt();
    }

    public double nextDouble() {
        while(!scanner.hasNextDouble()) {
            System.out.println("Please enter a double");
            scanner.nextLine();
        }
        return scanner.nextDouble();
    }

    public String nextLine() {
        return scanner.nextLine();
    }

    public void close() {
        scanner.close();
    }
}

