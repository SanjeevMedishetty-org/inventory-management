
inventory-management
This is a sample program which is used to arrange sitting based on tickets booking requests/theater layout

How to run the applicaton.

Option 1:

Create some folder say inventory-testing
download theater-sitting-problem.jar from https://github.com/SanjeevMedishetty-org/inventory-management
open inventory-testing in command promt and run using java -jar theater-testing.jar (update the input.txt if you wann test other scenarios)
Note: Sometimes jar corrupts when download from git then use option 2

Option 2:

git clone https://github.com/SanjeevMedishetty-org/inventory-management.git
import to eclipse as java project
use Run As Java 'InventoryManager.java'


--------------------------------

Test results.
TYPE COMMANDS: 
 CREATE ITEMNAME COSTPRICE SELLINGPRICE
 DELETE ITEMNAME
 UPDATEBUY ITEMNAME QUANTITY
 UPDATESELL ITEMNAME QUANTITY
 REPORT
 TYPE 'STOP' TO EXIT


Enter command
create Book01 10.50 13.79


Enter command
create Food01 1.47 3.98


Enter command
create Med01 30.63 34.29


Enter command
create Tab01 57.00 84.98


Enter command
updateBuy Tab01 100


Enter command
updateSell Tab01 2


Enter command
updateBuy Food01 500


Enter command
updateBuy Book01 100


Enter command
updateBuy Med01 100


Enter command
updateSell Food01 1


Enter command
updateSell Food01 1


Enter command
updateSell Tab01 2


Enter command
report
######################################################## Inventory Report #########################################################################################################################
Item Name							Bought At							Sold At							AvailableQty							Value
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Book01						10.5						13.79						100						1050.0
Food01						1.47						3.98						498						732.06
Med01						30.63						34.29						100						3063.0
Tab01						57.0						84.98						96						5472.0
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Total Value                                                                                                               10317.06
Profit since previous report                                                                                              116.94


Enter command
delete Book01


Enter command
updateSell Tab01 5


Enter command
create Mobile01 10.51 44.56


Enter command
updateBuy Mobile01 250


Enter command
updateSell Food01 5


Enter command
updateSell Mobile01 4


Enter command
updateSell Med01 10


Enter command
report
######################################################## Inventory Report #########################################################################################################################
Item Name							Bought At							Sold At							AvailableQty							Value
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Food01						1.47						3.98						493						724.71
Med01						30.63						34.29						90						2756.7
Mobile01						10.51						44.56						246						2585.46
Tab01						57.0						84.98						91						5187.0
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Total Value                                                                                                               11253.87
Profit since previous report                                                                                              -724.75


Enter command
