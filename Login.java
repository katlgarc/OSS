import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Login implements User {

    int i = 0;
    public void user () throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        int line = 1;

        System.out.print("Enter id: ");
        String id = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        boolean attempts = true;

        Scanner file = new Scanner(new File("C:\\Users\\ehspr\\IdeaProjects\\person1\\src\\accounts.txt"));

        while (file.hasNextLine()) {

            String[] entry = file.nextLine().split(", ");

            if (id.equals(entry[0]) && password.equals(entry[1])) {
                information(id);
                System.out.println("\nAccount Found\n");
                attempts = false;
            }
            //line++;
        }

        if (attempts) {
            System.out.println("\nNoAccount\n");
            user();
        }
    }

    public void information(String id) throws FileNotFoundException {



        Scanner scanner = new Scanner(System.in);
        Scanner file = new Scanner(new File("C:\\Users\\ehspr\\IdeaProjects\\person1\\src\\accounts.txt"));

        while (file.hasNextLine()) {

            String[] entry = file.nextLine().split(", ");

            if (id.equals(entry[0])) {

                String password = entry[1];
                String name = entry[2];
                String address = entry[3];
                String phonenumber = entry[4];
                String ccNum = entry[5];

                System.out.println("The users credentials are");
                System.out.println(id + " " + password + " " + name + " " + address + " " + phonenumber + " " + ccNum);
            }
        }
    }
}





