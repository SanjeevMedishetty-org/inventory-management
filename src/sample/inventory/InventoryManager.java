package sample.inventory;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

import sample.inventory.model.Item;

public class InventoryManager {
	
	private static final String SPACE = "\\s+";
	private static SortedMap<String, Item> inventoryMap =
            new TreeMap<String, Item>();
	public static float profit;
	public static float preProfit;
	public static float profSincePrevReport;

	@SuppressWarnings("resource")
	public static void main(String rags[]) {

		System.out.println(
				"Type Commands: \n create itemName costPrice sellingPrice\n delete itemName\n updateBuy itemName quantity\n updateSell itemName quantity\n report\n Type 'stop' to exit"
						.toUpperCase());
		String command = "start";
		while (!command.isEmpty() && !"stop".equalsIgnoreCase(command)) {
			System.out.println("\n\nEnter command");
			Scanner readString = new Scanner(System.in);
			command = readString.nextLine();
			if ("stop".equalsIgnoreCase(command.trim()) || command.trim().isEmpty()) {
				System.out.println("End Application");
				continue;
			}
			
			String commandWords[] = command.split(SPACE);
			
			if (commandWords.length > 4 || commandWords.length == 0) {
                 System.out.println("Command Invalid");
                 continue;
			}
			Command operation = CommandManager.getCommand(commandWords[0]);
			operation.executeCommand(inventoryMap, commandWords.length > 1 ? commandWords[1]:null, prepareItem(commandWords));

		}

	}

	private static Item prepareItem(String[] commandWords) {
		
		Item it = null;
		
		if(commandWords.length == 1 || commandWords.length == 2 ) return null;
		it= new Item();
		if(commandWords.length == 3) 
		{
			
			it.setQuantity(Integer.parseInt(commandWords[2]));
			return it;
		}
		else
		{
			it.setCostPrice(Float.parseFloat(commandWords[2]));
			it.setSellingPrice(Float.parseFloat(commandWords[3]));
		}
		
		
		return it;
	}

}
