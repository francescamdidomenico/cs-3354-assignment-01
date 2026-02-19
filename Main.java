import java.util.Scanner;

/**
 * Grocery management system using parallel arrays for item names, prices, and stocks.
 * Features a menu to allow the user to display inventory and restock items.
 */

public class Main {
    
    /**
     * Loops through array displaying section of parallel array if names[i] != null
     * @author Francesca Didomenico
     * @param names  
     * @param prices 
     * @param stocks
     */

    public static void printInventory(String[] names, double[] prices, int[] stocks)
    {
        for(int i = 0; i < names.length; i++)
        {
            if (names[i] != null)
            {
                System.out.println("Item Name: " + names[i]);
                System.out.println("Item Price: " + prices[i]);
                System.out.println("Item Stock: " + stocks[i]);
                System.out.println();
            }
        
        }
    }

    /**
     * Loops over the name array to find a target name, add amount to stocks at that index if found
     * @author Anup Basnet
     * @param names Array of item names
     * @param stocks Array of stock quantities
     * @param target Name of the item to find
     * @param amount Quantity to add
     */
    public static void restockItem(String[] names, int[] stocks, String target, int amount){
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null && names[i].equalsIgnoreCase(target)) {
                stocks[i] += amount;
                found = true;
                break; 
            }
        }
        if (!found) {
            System.out.println("Item not found.");
        }
    }


    /**
     * Main method of the class. Initializes inventory arrays and runs a loop 
     * that allows the user to view inventory, restock items, or exit.
     * @author Jack Doherty
     */
    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("--- Menu ---");
            System.out.println("Choose one of the following options:");
            System.out.println("1: View");
            System.out.println("2: Restock");
            System.out.println("3: Exit");

            String input = sc.nextLine().trim();

            if (input.equals("1")) {
                printInventory(itemNames, itemPrices, itemStocks);
            }
            
            else if (input.equals("2")) {
                System.out.println("Enter the name of the item to restock: ");
                String target = sc.nextLine().trim();

                System.out.println("Enter the amount to add: ");
                String amountString = sc.nextLine().trim();

                int amount = Integer.parseInt(amountString);

                if (amount <= 0) {
                    System.out.println("Invalid amount. Amount must be greater than zero.");
                    continue;
                }

                restockItem(itemNames, itemStocks, target, amount);
                System.out.println();

            }

            else if (input.equals("3")) {
                System.out.println("Goodbye!");
                break;
            }
        }

        sc.close();
    }
}
