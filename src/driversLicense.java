
public class driversLicense {

	private String[] correctAnswers = {"B", "D", "A", "A", "C", "A", "A", "C", "D", "B", "C", "D", "A", "D", "C", "C", "B", "D", "A"};
	private String[] studentAnswers = {};
	
	
	public void passFail()
	{
		if(numCorrect >= 15)
		{
			System.out.print("You passed the exam! \n");
		}
		else
			System.out.print("Sorry, you didn't pass the exam.. \n");
	}
	
	
	
}
