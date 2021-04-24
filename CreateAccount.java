import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

class CreateAccount implements User {

    boolean found = false;

    public void user () throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter id: ");
        String id = scanner.nextLine();

        Scanner file = new Scanner(new File("C:\\Users\\ehspr\\IdeaProjects\\person1\\src\\accounts.txt"));

        while (file.hasNextLine()) {

            String[] entry = file.nextLine().split(", ");

            if (id.equals(entry[0])) {
                found = true;
                information(id);
            }
        }

        if (!found) {
            getCredit(id);
        }

    }

    @Override
    public void information(String id) throws IOException {
        System.out.println("\nAccount Taken");
        found = false;
        user();
    }

    public void getCredit(String id) throws IOException {

        PrintWriter outputFile = new PrintWriter(new FileWriter("C:\\Users\\ehspr\\IdeaProjects\\person1\\src\\accounts.txt", true));
        Scanner in = new Scanner(System.in);
        String password, name, address, phonenumber, cc;

        System.out.print("Enter a password: ");
        password = in.nextLine();

        System.out.print("Enter a name: ");
        name = in.nextLine();

        System.out.print("Enter an address: ");
        address = in.nextLine();

        System.out.print("Enter a phone number: ");
        phonenumber = in.nextLine();

        System.out.print("Enter a cc: ");
        cc = in.nextLine();

        outputFile.write( "\n" + id + ", " + password + ", " + name + ", " + address + ", " + phonenumber + ", " + cc);
        outputFile.close();
    }
}





