package sample.inventory;

import java.math.BigDecimal;
import java.util.Map;
import java.util.SortedMap;

import sample.inventory.model.Item;

public class ReportItems implements Command {

	@Override
	public void executeCommand(SortedMap<String, Item> inventory, String itemName, Item it) {
		
	  float totalValue = 0.0f;	
		
	  System.out.println("######################################################## Inventory Report #########################################################################################################################");
	  System.out.println("Item Name							Bought At							Sold At							AvailableQty							Value");
	  System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	  for (Map.Entry<String,Item> entry : inventory.entrySet()) {
	
	  System.out.println(entry.getKey()+"						"+entry.getValue().getCostPrice()+"						"+entry.getValue().getSellingPrice()+"						"+entry.getValue().getQuantity()+"						"+(entry.getValue().getCostPrice()*entry.getValue().getQuantity()));	  
	  totalValue+= (entry.getValue().getCostPrice()*entry.getValue().getQuantity());	  
	  
	  }
	  
	  System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	  System.out.println("Total Value                                                                                                               "+roundOf(totalValue,2));
	  System.out.println("Profit since previous report                                                                                              "+roundOf((InventoryManager.profit-InventoryManager.preProfit),2));
	  InventoryManager.preProfit = InventoryManager.profit;    
  }
	
	private  BigDecimal roundOf(float number, int decimalPlace) {
        BigDecimal bd = new BigDecimal(Float.toString(number));
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);       
        return bd;
    }
		


}
