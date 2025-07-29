package Course2;

import java.util.Scanner;
import java.util.LinkedList;

//  Class to hold user data: username and password
class User {
    private String username;
    private String password;

    // Constructor to initialize user details
    public User(String name, String password) {
        this.username = name;
        this.password = password;
    }

    // Getter methods to access username and password
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

//  Main class to handle user registration and login
public class AuthenticationSystem {

    private LinkedList<User> userlist;  // To store registered users

    // Constructor to initialize the user list
    public AuthenticationSystem() {
        this.userlist = new LinkedList<>();
    }

    // 📥 Method to register a new user
    public void register(String username, String password) {
        User newuser = new User(username, password);
        userlist.add(newuser);
        System.out.println("✅ User registered successfully.");
    }

    // 🔐 Method to login an existing user
    public boolean login(String username, String password) {
        for (User user : userlist) {
            // Check both username and password match
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;  // Successful login
            }
        }
        return false;  // Failed login
    }

    // 🧠 Main method to run the authentication system
    public static void main(String[] args) {
        AuthenticationSystem authSystem = new AuthenticationSystem(); // Create system instance
        Scanner sc = new Scanner(System.in);
        boolean loggedIn = false;

        // Loop until login or exit
        while (!loggedIn) {
            System.out.println("\n🔘 Choose an option:");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            int choice = sc.nextInt();
            sc.nextLine(); // Clear input buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter a username: ");
                    String regUsername = sc.nextLine();
                    System.out.print("Enter a password: ");
                    String regPassword = sc.nextLine();
                    authSystem.register(regUsername, regPassword);
                    break;

                case 2:
                    System.out.print("Enter a username: ");
                    String loginUsername = sc.nextLine();
                    System.out.print("Enter a password: ");
                    String loginPassword = sc.nextLine();
                    if (authSystem.login(loginUsername, loginPassword)) {
                        System.out.println(" Login successful.");
                        loggedIn = true;
                    } else {
                        System.out.println("Invalid username or password.");
                    }
                    break;

                case 3:
                    System.out.println(" Exiting. Goodbye!");
                    loggedIn = true;
                    break;

                default:
                    System.out.println(" Invalid input. Please try again.");
                    break;
            }
        }

        sc.close(); // Clean up scanner
    }
}
