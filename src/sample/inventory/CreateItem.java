package sample.inventory;

import java.util.SortedMap;

import sample.inventory.model.Item;

public class CreateItem implements Command{

	@Override
	public void executeCommand(SortedMap<String, Item> inventory, String itemName, Item it) {
		
		if(inventory.get(itemName) != null)
		{
			System.out.println("Item Already Exists");
			return;
			
		}
		
		inventory.put(itemName, it);
		
		
	}



}
