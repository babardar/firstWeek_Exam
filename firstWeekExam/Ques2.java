package firstWeekExam;

import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) {
// 2.Take a number from user and Print if the number is less than 200 and even number otherwise print invalid number using Logical Operator
		System.out.println("Enter the number");
		Scanner number = new Scanner(System.in);
		int num = number.nextInt();
		if ((num<200)&&(num%2==0)) {
			System.out.println(num + " is less then 200 and even");
		}
		else if ((num<200)&&(num%2==1)){
			System.out.println("invalid Number");
		}
		number.close();
	
		
	}

}
//if ((num<200)&&(num%2==1))