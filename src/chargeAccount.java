
public class chargeAccount {
	
	public  boolean sequentialSearch(int[] array, int value)
	{
		int index;
		boolean found;
		
		index = 0;
		found = false;
		
		while(!found && index < array.length)
		{
			if (array[index] == value)
			{
				found = true; 
			}
			index++;
		}
		return found;
	}
	
}
