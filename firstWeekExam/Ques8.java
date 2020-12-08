package firstWeekExam;

import java.util.Scanner;

public class Ques8 {

	public static void main(String[] args) {
// Write Java Program using for-loop statement Excepted Output :How Many Rows You Want to Print ? 8
		Scanner scan = new Scanner(System.in);
	    System.out.println("How many rows you want?");
	    int Rows = scan.nextInt();
	    int rowCount = 1;
	    System.out.println("Here is your pyramid");
	    for (int x = Rows; x > 0; x--)
	    {
	      for (int y = 1; y <= x; y++)
	      {
	        System.out.print(" ");
	      }
	      for (int z = 1; z <= rowCount; z++)
	      {
	        System.out.print(z +" ");
	      }
	      System.out.println();
	      rowCount++;
	      scan.close();
	    }
  }
}
