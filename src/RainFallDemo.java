import java.util.Scanner;

public class RainFallDemo {

public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		final int NUM_MONTHS = 12;
		double totalRainfall = 0;
		double averageRainfall = 0;
		double largest = 0;
		double smallest = 1000;
		int leastMonth = 0;
		int mostMonth = 0;
		double[] rainfall = new double[NUM_MONTHS];
		
		System.out.print("Please enter the amount of rain for each of the 12 months.\n");
		for(int count = 0; (count + 1) <= NUM_MONTHS;)
		{
			System.out.print("The rainfall for month" + (count +1) + " was?");
			rainfall[count] = keyboard.nextDouble();
			while(rainfall[count] < 0)
			{
				System.out.print("Error, you entered a negative number!");
				System.out.print("The rainfall for month " + (count +1) + " was?");
				rainfall[count] = keyboard.nextDouble();
			}
			++count;
		}

		
		for(int count = 0; (count + 1) <= NUM_MONTHS;)
		{
			totalRainfall += rainfall[count];
			++count;
		}
		
		averageRainfall = totalRainfall / NUM_MONTHS;
		
		for(int count = 0; (count + 1) <= NUM_MONTHS;)
		{
			if(rainfall[count] > largest)
			{
				largest = rainfall[count];
				mostMonth = (count +1);
			}
			if (rainfall[count] < smallest)
			{
				smallest = rainfall[count];
				leastMonth = (count +1);
			}
			++count;
		}
		
		System.out.printf("The total rainfall was: %.02f\n", totalRainfall );
		System.out.printf("The average rainfall was: %.02f\n", averageRainfall );
		System.out.printf("The month with the most rainfall was: Month %d \n",mostMonth);
		System.out.printf("The month with the least rainfall was: Month %d ", leastMonth );
		
		keyboard.close();
	
	}
}
