import java.util.Scanner;

public class LoginSystem {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (login(username, password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }

        scanner.close();
    }

    public static boolean login(String username, String password) {
        boolean isValid = false;

        if (username.equals(USERNAME) && password.equals(PASSWORD)) {
            isValid = true;
        }

        return isValid;
    }
}
