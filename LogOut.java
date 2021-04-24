import java.io.IOException;
import java.util.Scanner;

public class LogOut {
    public static void choice() throws IOException {

        boolean quit = false;

        while (!quit) {
            Scanner in = new Scanner(System.in);
            String choice;
            System.out.println("Enter l to login,c to create an account, or e to logout");
            choice = in.nextLine();

            if (choice.equals("l")) {
                Login login = new Login();
                login.user();
            } else if (choice.equals("c")) {
                CreateAccount account = new CreateAccount();
                account.user();
            } else if (choice.equals("e")) {
                System.exit(0);
            }
        }
    }
}
