import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // arraylists holding the total number of doctors, Beds and patients in the
        ArrayList<User> allUsers = new ArrayList<>(100);
        Bed[] allBeds = new Bed[500];
        // hospital;

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
            // Doctor portion
            if (CurrentUser instanceof Doctor) {// ! Complete
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
                // Patient Portion
            } else if (CurrentUser instanceof Patient) {
                Choice = input.nextInt();
                System.out.println(
                        "Enter 1 To view Current Information \nEnter 2 to view Medical Record :\nEnter 3 to Buy Medicine from Inventory : \nEnter 4 to view Current Notifications :\nEnter 5 to view Available Doctors \nEnter 0 to Exit : ");
                do {
                    if (Choice == 1) {
                        System.out.println(CurrentUser);
                    } else if (Choice == 2) {
                        // CurrentUser.ViewMedicalRecord();

                    } else if (Choice == 3) {// !not complete
                        System.out.println("Enter 1 to view Available items\n Enter 2 to Buy items :\n 0 to exit : ");
                        myInventory.Displayinventory();
                       double bill = myInventory.BuyItems();
                    
                        

                    } else if (Choice == 4) {// !not complete

                        // TODO: Later
                    } else if (Choice == 5) {
                        System.out.println(
                                "What type of Doctor do you want to visit :\nTypeA\nTypeB\nTypeC\nTypeD\nTypeE");
                        int docChoice = input.nextInt();
                        if (docChoice == 1) {
                            ViewSpecialist("TypeA", allUsers);

                        } else if (docChoice == 2) {
                            ViewSpecialist("TypeB", allUsers);

                        } else if (docChoice == 3) {
                            ViewSpecialist("TypeC", allUsers);

                        } else if (docChoice == 4) {
                            ViewSpecialist("TypeD", allUsers);

                        } else if (docChoice == 5) {
                            ViewSpecialist("TypeE", allUsers);
                        } else {
                            System.out.println("Invalid Output");
                        }
                    } else if (Choice == 0) {
                        System.out.println("Exited : ");
                    } else {
                        System.out.println("wrong choice : ");
                    }
                } while (Choice != 0);
            } else if (CurrentUser.getID() == "A-1") {
                System.out.println(
                        "1 to add Doctor : \n2 to schedule Appointment : \n3 Manage inventory :\n4 send notification :\n5 Edit patients ");
                Choice = input.nextInt();
                if (Choice == 1) {// ! Complete
                    Doctor newdoc = new Doctor();
                    newdoc.SetDoctor();
                    allUsers.add(newdoc);// adds new doctor to array list of users
                } else if (Choice == 2) {// ! Complete
                    System.out.println("Enter Id of the Doctor for whom you want to schedule Appointment : ");
                    String tempID = input.nextLine();
                    Doctor dtemp = null;
                    if (searchUsers(tempID, allUsers) != -1) {
                        dtemp = (Doctor) allUsers.get(searchUsers(tempID, allUsers));
                    } else {
                        System.out.println("Doctor does not Exist : ");
                    }
                    Patient ptemp = null;
                    tempID = input.nextLine();
                    if (searchUsers(tempID, allUsers) != -1) {
                        ptemp = (Patient) allUsers.get(searchUsers(tempID, allUsers));
                    } else {
                        System.out.println("Patient DOes not Exist ");
                    }
                    Appointment tempAppointment = new Appointment(ptemp, dtemp);
                    dtemp.addAppointment(tempAppointment);
                    allUsers.set(searchUsers(tempID, allUsers), dtemp);
                } else if (Choice == 3) {// ! Complete
                    System.out.println("1 to add item, 2 to update item, 3 to view Inventory : ");
                    Choice = input.nextInt();
                    if (Choice == 1) {
                        myInventory.Addinventory();
                    } else if (Choice == 2) {
                        myInventory.updateinventory();
                    } else if (Choice == 3) {
                        myInventory.Displayinventory();
                    } else if (Choice == 4) {
                        // ! not Complete
                    } else if (Choice == 5)// ! Complete
                    {
                        System.out.println("Enter the ID of the patient you want to edit : ");
                        String tempID = input.nextLine();
                        if (searchUsers(tempID, allUsers) != -1) {
                            Patient ptemp = (Patient) allUsers.get(searchUsers(tempID, allUsers));
                            ptemp.SetPatient();
                            allUsers.set(searchUsers(tempID, allUsers), ptemp);
                        } else {
                            System.out.println("ID does not Exist : ");
                        }
                    }
                }
            } else {
                System.out.println("An error Has occurred : ");
            }
        }
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

    private static int searchUsers(String id, ArrayList<User> users) {
        for (int index = 0; index < users.size(); index++) {
            if (users.get(index).getID() == id) {
                return index;
            }
        }
        return -1;
    }
}
