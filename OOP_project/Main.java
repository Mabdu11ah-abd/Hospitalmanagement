import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // arraylists holding the total number of doctors, Beds and patients in the
        // hospital;

        ArrayList<User> allUsers = new ArrayList<>(100);

        // creating an admin user
        User Admin = new User();
        Admin.RegisterUser("Admin", "Admin234", "A-1", "Administrator");
        allUsers.add(Admin);
        // inventory object

        Inventory myInventory = new Inventory();
        // Scanner variable for user input

        Scanner input = new Scanner(System.in);
        // Login menu
        User CurrentUser = null;// variable that stores current user
        int Choice;// Choice variable for menus of entire program

        while (true) {
            // loop runs for the entire program

            // !first Loop for Role Selection....
            while (CurrentUser == null) {
                System.out.println("Enter 1 for Doctor,2 for patient, 3 for Admin : ");// taking users choice
                Choice = input.nextInt();
                if (Choice == 1) {// !Complete
                    CurrentUser = loginUser(allUsers, input);
                } else if (Choice == 2) {// !Complete
                    do {
                        CurrentUser = loginUser(allUsers, input);
                    } while (CurrentUser != null);
                } else if (Choice == 3) {// !notComplete
                    System.out.println("Do you want to register as a new User or Login, Enter 1 or 2 : ");
                    Choice = input.nextInt();
                    if (Choice == 1) {
                        // TODO: later
                    } else {
                        CurrentUser = loginUser(allUsers, input);
                    }
                } else {
                    System.out.println("Invalid Choice Give input again : ");
                }
            }
            if (CurrentUser instanceof Doctor) {
                do {
                    Choice = input.nextInt();
                    System.out.println(
                            "Enter 1 to view Patient : \nEnter 2 to Write Prescription\n Enter 3 to UpdatePatient Data ");
                    if (Choice == 1) {
                        ((Doctor)CurrentUser).ViewPatients();

                    } else if (Choice == 2) {
                        ((Doctor)CurrentUser).WritePrescription();

                    } else if (Choice == 3) {

                    } else if (Choice == 0) {
                        System.out.println("Exited Successfully : ");
                    } else {
                        System.out.println("Invalid input enter again  : ");
                    }
                } while (Choice != 0);

            } else if (CurrentUser instanceof Patient) {

            } else if (CurrentUser.getID() == "A-1") {

            } else {
                System.out.println("An error Has occurred : ");
            }

        }

        // TODO : present options as the doctor patient and admin

    }

    private static User loginUser(ArrayList<User> allUsers, Scanner input) {
        System.out.println("Enter Your ID and Password: ");
        String tempID = input.nextLine();
        String tempPassword = input.nextLine();

        for (User user : allUsers) {
            if (user.login(tempID, tempPassword)) {
                System.out.println("Logged in Successfully.");
                return user;
            }
        }
        return null;
    }
}
