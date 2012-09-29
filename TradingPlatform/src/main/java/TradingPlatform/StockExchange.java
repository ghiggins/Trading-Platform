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
    	int menu= 0;
    
    	while (menu!=6){	//while loop to make menu appear after each method is run
			try{
				System.out.println("Choose an option from the menu and press Enter.\n");
				System.out.println("1. Create account\n2. Make request\n3. View brokers\n4. View companies\n5. View Trading History\n6. Exit");
				Scanner scanner = new Scanner(System.in);
				menu=Integer.parseInt(scanner.next());
			}
			catch(NumberFormatException n){
				menu=0;
			}							  

		 	switch (menu)
		 	{
			case 1: 
		 	}
		}
    }
}
