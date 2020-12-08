package firstWeekExam;

import java.util.Scanner;

public class Ques5 {

	public static void main(String[] args) {
// Take a year as input and Print the year is leap year or not a leap year using Nested-if else statement
		
		System.out.println("Enter the year");
        Scanner year = new Scanner(System.in);
         int yr = year.nextInt();
         if(yr%4==0) {
      	   System.out.println(yr + " is a leap year");
      	   if(yr%100==0) {
      		   System.out.println(yr + " is a leap year");
      		   if(yr%400==0) {
      			   System.out.println(yr + " is a leap year");
      		   }
      	   }
         }
         else {
      	   System.out.println(yr + " is not leap year");
         }
         year.close();

	}

}
