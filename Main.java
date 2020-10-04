
public class Main {

	public static void main(String[] args) {

		   // kindly use appropriate data types for your declaration
		   //declare an array variable and assign the days of the month debtor defaulted,
		   byte [] daysDefaulted ={1, 2, 3, 8, 16, 19, 23};  
		   // declare variables of amount the debtor is to pay per day, and amount the debtor paid and assign values to them
		   		float amountPerDay = 1000f;
		   		float amountPaid = 2000f;
		   // declare all the variables needed for your calculations
		   		float amountToPay = 0f;
		   		byte daysPaidFor;
		   		float amountLeftToPay;
		   		byte noOfDaysDefaulted = 7;
		   		byte daysNotPaid;
		   		float extraAmount;
		   		float incompleteAmount = 0f;
		   		float exactAmount;
		   // calculate and print total amount the debtor is to pay using for each loop
		   		
		   		for(byte i:daysDefaulted) {
		   			amountToPay+=amountPerDay;
		   		}
		   		System.out.println("The amount the debtor is to pay ia "+amountToPay);
		   // calculate the days the debtor paid for and print the days in which was paid for starting from the left to the right of the array. Also check if there was a day that the debtor did not pay the complete amount for that day, if yes, print the day and the amount left to pay for that day. 
		   		daysPaidFor = (byte)(amountPaid/amountPerDay);
		   		System.out.println("The days the debtor paid for is  "+daysPaidFor+" day(s)");
		   		System.out.println("");
		   		
		   			for(int i = 0; i < noOfDaysDefaulted && i < daysPaidFor; i++) {
		   			System.out.println("Day"+daysDefaulted[i]+"has been paid for");
		   			System.out.println("");
		   			}
			   		
		   				if(amountPaid%amountPerDay >0)
		   					incompleteAmount = amountPerDay - (amountPaid%amountPerDay);
		   				System.out.println("The incomplete amount in a day left to pay is "+incompleteAmount);
		   				System.out.println("");
               System.out.println("The day defaulted for incomplete amount is "+daysDefaulted[daysPaidFor]);
		   // calculate amount the debtor is left to pay if he did not pay complete fees and the days not paid for or  check if the debtor paid extra and the extra amount he paid for, or if he paid the exact amount needed to be paid and print likewise
		   			if(amountToPay > amountPaid) {
		   				amountLeftToPay = amountToPay - amountPaid;
		   			System.out.println("The amount left to pay is "+amountLeftToPay);
		   			System.out.println("");
		   			daysNotPaid = (byte)( noOfDaysDefaulted - daysPaidFor);
		   			System.out.println("The days not paid are "+daysNotPaid);
		   			System.out.println("");
	}
		   			else if (amountToPay < amountPaid) {
		   				extraAmount = amountPaid - amountToPay;
		   				System.out.println("Extra Amount of "+extraAmount+"was paid");
		   				System.out.println("");
		   			}
		   			
		   			else if (amountToPay==amountPaid) {
		   				System.out.println("The exact amount was paid");
		   			}
		   			
		   			}
}
