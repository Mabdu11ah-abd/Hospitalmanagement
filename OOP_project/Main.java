import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // arraylists holding the total number of doctors, Beds and patients in the
        // hospital;

        ArrayList<User> allUsers = new ArrayList<>(100);
        
        //creating an admin user 
        User Admin =new User();
        Admin.RegisterUser("Admin" ,"Admin234" ,"Administrator" );
        allUsers.add(Admin);
        // inventory object

        Inventory myInventory = new Inventory();
        // Scanner variable for user input

        Scanner input = new Scanner(System.in);
        // TODO : make a login menu,

        User CurrentUser;
        System.out.println("Enter 1 for Doctor,2 for patient, 3 for Admin : ");
        int Role = input.nextInt();
        while (true) {
            if (Role == 1) {
                CurrentUser = allUsers.get(0);
            
            } else if (Role == 2) {
                System.out.println("Enter Your ID and Password : ");
                String tempID=input.nextLine();
                String tempPassword = input.nextLine();
                for (User user : allUsers) {
                    
                }

                


            } else if (Role == 3) {
            
            } 
            else 
            {
                System.out.println("Invalid Choice Give input again : ");

            }

        }

        // TODO : present options as the doctor patient and admin

    }
}

