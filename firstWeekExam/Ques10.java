package firstWeekExam;

import java.util.Scanner;

public class Ques10 {

	public static void main(String[] args) {
/*Write a program to input indefinite numbers and then calculate the sum of only the positive numbers. 
   The program terminates when negative numbers is input*/
		int num,sum=0;
     Scanner input = new Scanner(System.in);
     System.out.print("Enter positive Numbers and Negative Number to Quit :");
     while(true)
            {
    	 	num=input.nextInt(); 
    	 	if(num<0)
    	 	break;
    	 	sum +=num;
            }
     		System.out.println( "Sum is : " +sum);
     		input.close();
   }

}
