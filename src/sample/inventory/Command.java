package sample.inventory;

import java.util.SortedMap;

import sample.inventory.model.Item;

public interface Command {
	
	void executeCommand(SortedMap<String, Item> inventory,String itemName, Item it);

}
