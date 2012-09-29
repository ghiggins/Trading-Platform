package TradingPlatform;

import java.util.Scanner;

/**
 * Stock Exchange
 *
 */
public class StockExchange 
{
    public static void main( String[] args )
    {
        StockExchange stockEx = new StockExchange();
        stockEx.displayMenu();
        
        System.exit(0);
    }
    
    public void displayMenu(){
    	int menuItem= 0;
    	Scanner scanner = new Scanner(System.in);
    	
    	while (menuItem!=6){	//while loop to make menu appear after each method is run
			try{
				System.out.println( "\n1. Create account..........................\n" +
									"2. Make request............................\n" +
									"3. View brokers............................\n" +
									"4. View companies..........................\n" +
									"5. View Trading History....................\n" +
									"6. Exit....................................\n");
				System.out.print("Choose an option from the menu and press Enter.");
				menuItem = scanner.nextInt(); 		
			}
			catch(NumberFormatException n){
				menuItem=0;
			}

		 	switch (menuItem)
		 	{
			case 1: 
				System.out.println("You want to create an account");
				break;
			case 2:
				System.out.println("You want to make a request");
				break;
			case 3:
				System.out.println("You want to view brokers");
				break;
			case 4:
				System.out.println("You want to view companies");
				break;
			case 5:
				System.out.println("You want to view your trading history");
				break;
			default:
				System.out.println("Selection not available try another menu listing");
		 	}
		}
    }
}
