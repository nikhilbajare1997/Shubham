package loops;

public class ForLoopStarPattern2 {
//	*				
//	*	*			
//	*	*	*		
//	*	*	*	*	
//	*	*	*	*	*
// Note. we prepare logic with the help of steps in excel sheet.
// refer Star Print Program Excel Sheet 
	public static void main(String[] args) {
		
	for (int i =1; i<=5; i++)// external loop or row
	{
		
	for (int j =1; j<=5; j++)//inner loop or column
	{
		if(j<=i)
		{
			System.out.print("*");
		}
		else
		{
			System.out.print(" ");
		}
		
		
	}
	System.out.println();
	}
}
}