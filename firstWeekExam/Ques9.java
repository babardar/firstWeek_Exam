package firstWeekExam;

import java.util.Scanner;

public class Ques9 {

	public static void main(String[] args) {
		// 9.Write Java Program using for-loop statement Excepted Output :How Many Rows You Want to Print?
		
				Scanner number = new Scanner(System.in); 
			    System.out.println("How many rows you want?");
			    int Rows = number.nextInt();
			    int rowCount = 1;
			    System.out.println("Here Is Your Pyramid");
			    for (int x = Rows; x > 0; x--)
			    {
			      for (int y = 1; y <= x; y++)
			      {
			        System.out.print(" ");
			      }
			      for (int z = 1; z <= rowCount; z++)
			      {
			        System.out.print(rowCount+" ");
			      }
			      System.out.println();
			      rowCount++;
			    }
			    number.close();
	}

}
