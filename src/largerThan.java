
public class largerThan {

	public static void main(String[] args) {
		
		int[] array1 = {1,2,3,4,5,6,7,8,9,10};
		
		numDisplay(array1 , 4);
		
		

	}
	

	public static void numDisplay(int[] integers, int n)
	{
		for(int i =0;i<integers.length;i++)
		{
			if(n < integers[i])
			{
				System.out.println(integers[i] + " is greater than " + n);
			}
		}
	}

}
