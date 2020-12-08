package firstWeekExam;

public class Ques3 {

	public static void main(String[] args) {
// Write a Fibonoci’s series program as 0 11 2 3 5 8...n numbers and run in the command prompt
		
		int maxNum = 12; 
		int firstNum = 0;
		int nextNum = 1;
		System.out.print("Fibonacci Series of " + maxNum + " numbers: ");
		for (int i = 1; i <= maxNum; ++i)
		{	System.out.print(firstNum + " ");
			int sum = firstNum + nextNum;
			firstNum = nextNum;
			nextNum = sum;
   		}
	}
}