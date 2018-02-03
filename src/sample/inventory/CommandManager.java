package sample.inventory;

import java.util.HashMap;
import java.util.Map;

public class CommandManager {
	
	private static Map<String,Command> commandsMap = new HashMap<String,Command>();
	
	static
	{
		commandsMap.put("create", new CreateItem());
		commandsMap.put("delete", new DeleteItem());
		commandsMap.put("updateBuy", new UpdateBuyItem());
		commandsMap.put("updateSell", new UpdateSellItem());
		commandsMap.put("report", new ReportItems());
		
	}
	
	public static Command getCommand(String command)
	{
		
		return commandsMap.get(command);
		
	}
	

}
