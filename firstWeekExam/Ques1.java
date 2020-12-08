package firstWeekExam;

import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {

// 1.Take input from the user and Print if the number is less than or greater than 100 using Ternary Operator		
		System.out.println("Enter Number");
		Scanner num= new Scanner(System.in);      
		int a = num.nextInt(); 
		String result = a > 100 ? "Number is greter than 100: " + a : a <100 ? "Number is less than 100: " + a : "Number is equal to 100";
		System.out.println(result);
		num.close();
	}

}
