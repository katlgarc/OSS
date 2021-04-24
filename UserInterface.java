import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

interface User {
    public void user() throws IOException;
    public void information(String id) throws IOException;
}

class UserInterface {
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        String choice;
        System.out.print("Enter l to login or c to create an account: ");
        choice = in.nextLine();

        if(choice.equals("l")) {
            Login login = new Login();
            login.user();

            String logout;
            System.out.println("\nEnter q to logout of account");
            logout = in.nextLine();

            if(logout.equals("q")){
                LogOut logOut = new LogOut();
                logOut.choice();
            }

        } else if (choice.equals("c")) {
            CreateAccount account = new CreateAccount();
            account.user();

            String logout;
            System.out.print("\nEnter q to logout of account: ");
            logout = in.nextLine();

            if(logout.equals("q")){
                LogOut logOut = new LogOut();
                logOut.choice();
            }
        }
    }
}
