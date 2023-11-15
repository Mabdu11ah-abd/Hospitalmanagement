import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
    private ArrayList<Item> ItemsinInventory = new ArrayList<Item>(20);

    public void Displayinventory()

    {
        for (int i = 0; i < ItemsinInventory.size(); i++) {

            ItemsinInventory.get(i).Displayitem();

            System.out.println("\nNext Item\n");
        }
    }

    public void Addinventory() {
        Item temp = new Item();
        temp.SetItem();
        ItemsinInventory.add(temp);
    }

    public void updateinventory() {
        Scanner input = new Scanner(System.in);
        // features to add in update inventory method :
        /*
         * 1.Display menu of functions that the user can perform:
         * 2.remove Item
         * 3.update Quantity of item or price depending on choice
         * 4.Add item
         * 5.search Item by ID
         */
        System.out.println("1.Update Quantity Or Price :\n2.Remove Item\n3.AddItem\4.Exit");
        int choice = input.nextInt();
        while (true) {
            if (choice == 1) {
                System.out.println("Enter the id of the Product you want to search : ");
                String TempID = input.nextLine();
                //nested if else condition
                if (searchItem(TempID) != -1) {
                    ItemsinInventory.get(searchItem(TempID)).UpdateQuantity();
                } else {
                    System.out.println("item does not exist");
                }
            } else if (choice == 2) {
                System.out.println("Enter the id of the Product you want to remove : ");
                 String TempID = input.nextLine();
                if (searchItem(TempID) != -1) {
                    ItemsinInventory.remove(searchItem(TempID));
                } else {
                    System.out.println("item does not exist");
                }

            }

        }

    }

    public int searchItem(String id) {
        int index = -1;
        for (int i = 0; i < ItemsinInventory.size(); i++) {
            if (ItemsinInventory.get(i).getItemID() == id) {
                index = i;
            }
        }
        return index;
    }
}
