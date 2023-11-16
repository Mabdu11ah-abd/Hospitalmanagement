import java.util.ArrayList;
import java.util.Scanner;

public class Item {

    private String ItemID;
    private String Itemname;
    private String Manufacturer;
    private int Quantity;
    private Double Price;

    public void SetItem() {
        // scanner variable for input
        Scanner input = new Scanner(System.in);

        // taking user input for item attributes
        System.out.println("Enter the ID of the Item : ");
        this.ItemID = input.nextLine();
        System.out.println("Enter the Name of the Item : ");
        input.nextLine();
        this.Itemname = input.nextLine();
        System.out.println("Enter the Manufacturer Name of the item : ");
        this.Manufacturer = input.nextLine();
        System.out.println("Enter the Quantity of the item : ");

        // TODO: Set limits for price and quatntity

        this.Quantity = input.nextInt();
        System.out.println("Enter the price of the item : ");
        this.Price = input.nextDouble();
    }

    public void Displayitem() {

        // TODO: Write statements and format output for the method

        System.out.println(ItemID);
        System.out.println(Itemname);
        System.out.println(Manufacturer);
        System.out.println(Quantity);
        System.out.println(Price);
    }

    public void UpdateQuantity() {
        Scanner input = new Scanner(System.in);
        System.out.println("WHat do you want to change about the item : ");
        System.out.println("1.Price\n2.Quantity\n3.Exit");
        while (true) {
            int choice = input.nextInt();
            if(choice==1)
            {
                System.out.print("Enter the new price : ");
                this.Price=input.nextDouble();
            }
            else if(choice==2)
            {
                System.out.print("Enter the new Quantity : ");
                this.Quantity=  input.nextInt();
            }
            else if(choice==3)
            {
                break;
            }
            else
            {
                System.out.println("Invalid input!!!");
            }

        }
    }
    public String getItemID() {
        return ItemID;
    }
}
