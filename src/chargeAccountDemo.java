import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class chargeAccountDemo {

	public static void main(String[] args) throws IOException {

		int[] chargeNums = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 8080152, 4562555, 5552012, 5050552, 7825877, 1250255, 1005231, 3852085, 7576651, 7881200, 4581002};
		String validity;
		
		chargeAccount charge1 = new chargeAccount();
		Scanner keyboard = new Scanner(System.in);
		
		//get filename
		System.out.print("Enter the filename:");
		String filename = keyboard.nextLine();
				
		//open file
		PrintWriter outputFile = new PrintWriter(filename);
				
		//get data and write it to the file
		outputFile.println("----------------------------");
		for(int count = 0; (count + 1) <= chargeNums.length;)
		{
			outputFile.printf("Valid charge accounts are: \n");
			outputFile.printf("%d \n", chargeNums[count]);
			count++;
		}		
		
		
		System.out.println("Enter your charge account number.");
		int accountNum = keyboard.nextInt();
		
		if(charge1.sequentialSearch(chargeNums, accountNum) == true)
		{
			validity = "valid";
		}
		else
			validity = "invalid";
		
		System.out.printf("You're account number is %s.", validity );
				
		//close leaks
		outputFile.close();
		keyboard.close();
	}

}
