package firstWeekExam;

import java.util.Scanner;

public class Ques6 {

	public static void main(String[] args) {
// Check whether an alphabet is vowel or consonant using switch statement

		boolean isVowel=false;;
		Scanner letter=new Scanner(System.in);
		System.out.println("Enter a character : ");
		char alphabet=letter.next().charAt(0); 
		letter.close();
		switch(alphabet)
		{
		   case 'a' :
		   case 'e' :
		   case 'i' :
		   case 'o' :
		   case 'u' :
		   case 'A' :
		   case 'E' :
		   case 'I' :
		   case 'O' :
		   case 'U' : isVowel = true;
		}
		if(isVowel == true) {
		   System.out.println(alphabet + " is  a Vowel");
		}
		else {
			if((alphabet >= 'a' && alphabet <= 'z')||(alphabet >= 'A' && alphabet <= 'Z'))
				System.out.println(alphabet + " is a Consonant");
			else
				System.out.println("Input is not an alphabet");		
		}

	}

}
