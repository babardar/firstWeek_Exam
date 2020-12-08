package firstWeekExam;

import java.util.Scanner;

public class Ques12 {

	public static void main(String[] args) {
/* By using do while loop, write Java program to prompt the user to choose the correct 
	     answer from a list of answer choices of a question.*/
		
       System.out.println("What is the command keyword to exit a loop in Java?");
       System.out.println("a.quit");
       System.out.println("b.continue");
       System.out.println("c.break");
       System.out.println("d.exit");
       Scanner keyword = new Scanner(System.in);
		int x = 0;
		do {
			char a = keyword.next().charAt(0);
       	if(a=='c') {
       		System.out.println("Congratulations");
       		continue;
       	}
       	else {
       		System.out.println("Incorrect, Try Again!");	
       		}
       }
		while (x<=10);
		keyword.close();
	}

}
