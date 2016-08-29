/**
 * The CurrencyConversion class converts an amount of money from a specific
 * country into the equivalent currency of another country given the current
 * exchange rate.
 *
 *
 * ©CSA/FLVS 2011
 * @author Maria Vieta Jacquard
 * @version 09/01/11
 */
public class CurrencyConversionV1
{
    public static void main(String [ ] args)
    {
        double Starting_US_Dollars = 5000.00;		// local variable for US Dollars
        double Pesos_Spent = 7210.25;            // local variable for Mexican pesos spent
        double Peso_Exchange_Rate = 0.0;          // local variable for exchange rate of US Dollars to Pesos
        double Dollars_Spent_In_Mexico = 0.0;      // local variable for dollars spent in Mexico
        double Remaining_US_Dollars = 0.0;        // local variable for US Dollars remaining
        //remaining variables below here

        // purpose of program
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // convertion for Mexican pesos
        // code goes below here
        Peso_Exchange_Rate = 18.629;
        Dollars_Spent_In_Mexico = Pesos_Spent/Peso_Exchange_Rate;
        Remaining_US_Dollars = Starting_US_Dollars - Dollars_Spent_In_Mexico;
        
        // convertion for Japanese yen
        // code goes below here
        double Yen_Exchange_Rate = 102.254;
        double Yen_Spent = 99939.75;
        double Dollars_Spent_In_Japan = Yen_Spent/Yen_Exchange_Rate;
        Remaining_US_Dollars -= Dollars_Spent_In_Japan;

        // convertion for Euros
        // code goes below here
        double Euro_Exchange_Rate = 0.895;
        double Euros_Spent = 624.95;
        double Dollars_Spent_In_France = Euros_Spent/Euro_Exchange_Rate;
        Remaining_US_Dollars -= Dollars_Spent_In_France;
        //print output to the screen
        // code goes below here
        System.out.print("Starting US Dollars: ");
        System.out.println(Starting_US_Dollars);
        System.out.print("US Dollars Spent In Mexico: ");
        System.out.println(Dollars_Spent_In_Mexico);
        System.out.print("US Dollars Spent In Japan: ");
        System.out.println(Dollars_Spent_In_Japan);
        System.out.print("US Dollars Spent in France: ");
        System.out.println(Dollars_Spent_In_France);
        System.out.print("Remaining US Dollars: ");
        System.out.println(Remaining_US_Dollars);

        // Complete the code below. Replace th 0's for totalItem and fundsRemaining
        // with the proper calculations. Casting, integer division and the modulus
        // operator needed. Do not worry about extra decimal places for the dollar amounts.

 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculations for Souvenir #1
		int costItem1 = 4;  						//cost per item of first souvenir
		int budget1 = 50;   						//budget for first item
		int totalItem1 = 0; 		//how many items can be purchased
		double fundsRemaining1 = 0.0;  //how much of the budget is left

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItem1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);

		//Calculations for Souvenir #2
		double costItem2 = 32.55;  						//cost per item of second souvenir
		int budget2 = 713;   							//budget for second item
		int totalItem2 = 0; 	//how many items can be purchased
		double fundsRemaining2 = 0.0;  	//how much of the budget is left

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItem2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class