package sample.inventory;

import java.util.SortedMap;

import sample.inventory.model.Item;

public class UpdateBuyItem implements Command {

	@Override
	public void executeCommand(SortedMap<String, Item> inventory, String itemName, Item it) {
		
		Item itemMap = inventory.get(itemName);
		
		if(itemMap != null)
		{
			itemMap.setQuantity(itemMap.getQuantity()+it.getQuantity());
		}
		
		
	}

}
