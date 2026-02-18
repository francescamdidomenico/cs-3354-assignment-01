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

}
