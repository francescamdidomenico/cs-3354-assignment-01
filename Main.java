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

}
