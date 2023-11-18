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
                        ((Doctor) CurrentUser).ViewPatients();

                    } else if (Choice == 2) {
                        ((Doctor) CurrentUser).WritePrescription();

                    } else if (Choice == 3) {
                        ((Doctor) CurrentUser).UpdatePatientNotes();

                    } else if (Choice == 0) {
                        System.out.println("Exited Successfully : ");
                    } else {
                        System.out.println("Invalid input enter again  : ");
                    }
                } while (Choice != 0);

            } else if (CurrentUser instanceof Patient) {
                Choice = input.nextInt();
                System.out.println(
                        "Enter 1 To view Current Information \nEnter 2 to view Medical Record :\nEnter 3 to Buy Medicine from Inventory : \nEnter 4 to view Current Notifications :\nEnter 5 to view Available Doctors \nEnter 6 to Exit : ");
                do {
                    if (Choice == 1) {
                        System.out.println(CurrentUser);
                    } else if (Choice == 2) {
                        
                        // TODO: Later
                    } else if (Choice == 3) {
                        // TODO: Later
                    } else if (Choice == 4) {
                        // TODO: Later
                    } else if (Choice == 5) {
                        System.out.println(
                                "What type of Doctor do you want to visit :\nTypeA\nTypeB\nTypeC\nTypeD\nTypeE");
                        int docChoice = input.nextInt();
                        if (docChoice == 1) {
                            ViewSpecialist("TypeA",allUsers);

                        } else if (docChoice == 2) {
                            ViewSpecialist("TypeB",allUsers);

                        } else if (docChoice == 3) {
                            ViewSpecialist("TypeC",allUsers);

                        } else if (docChoice == 4) {
                            ViewSpecialist("TypeD",allUsers);

                        } else if (docChoice == 5) {
                            ViewSpecialist("TypeA",allUsers);
                        } else {
                            System.out.println("Invalid Output");
                        }
                    } else {
                        System.out.println("wrong choice : ");
                    }
                } while (Choice != 0);
            }

            else if (CurrentUser.getID() == "A-1") {

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

    private static void ViewSpecialist(String type, ArrayList<User> allUsers) {
        for (User user : allUsers) {
            if (user instanceof Doctor) {
                Doctor d = (Doctor) user;
                System.out.println(d);
            }
        }
    }
}
