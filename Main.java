import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("UserName: ");
        String userName = scanner.nextLine();
        System.out.print("userName: " + userName);

        System.out.println("password: ");
        String Password = scanner.nextLine();
        System.out.print("password: " + Password);

        System.out.println("Enter your username: ");
        String loginUser = scanner.nextLine();
        System.out.println("Enter your password: ");
        String loginPassword = scanner.nextLine();
        
        if (loginUser.equals(userName) && loginPassword.equals(Password)) { 
         System.out.print("Correct login!");
        }
        else {
            System.out.println("Incorrect login!");
        }
    }
}
