import java.util.Scanner;

/**
 * Create a method for allowing a user to log into a website.
 * The method should contain two parameters - username and password.
 * In the method, if the username equals "neo" and the password equals "followthewhiterabbit" print, "Welcome, Neo".
 * Otherwise, print "Invalid username or password".
 * Invoke the method.
 **/

public class UserLoginTernary {

    // use a ternary operator
    public static String loginCredentialsCheck(String username, String password) {
        // must use .equals() instead of '==' if using a scanner object
        String loginMsg = username.equals("neo") && password.equals("followthewhiterabbit") ? "Welcome, Neo" : "Invalid input";
        return loginMsg;
    }

    // run the program
    public static void main(String[] args) {
        // create a scanner object
        Scanner console = new Scanner(System.in);
        // ask user for username
        System.out.println("Please enter a username: ");
        // store the username in lower case
        String usernameConsoleInput = console.nextLine().toLowerCase();
        // ask user for a password
        System.out.println("Please enter a password: ");
        // store the password in lower case
        String passwordConsoleInput = console.nextLine().toLowerCase();
        // invoke the method to check if user has right username and password
        String display = loginCredentialsCheck(usernameConsoleInput, passwordConsoleInput);
        // display results
        System.out.println(display);
    }
}
