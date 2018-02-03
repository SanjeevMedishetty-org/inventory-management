package sample.inventory;

import java.util.SortedMap;

import sample.inventory.model.Item;

public class DeleteItem implements Command {

	@Override
	public void executeCommand(SortedMap<String, Item> inventory, String itemName, Item it) {
		
		Item rItem = inventory.get(itemName);
		if(itemName != null){
		InventoryManager.profit-=rItem.getCostPrice()*rItem.getQuantity();
		inventory.remove(itemName);
		}
		
	}



}
