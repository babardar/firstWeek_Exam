package firstWeekExam;

public class Ques11 {

	public static void main(String[] args) {
		 //Write a program to print year from 1 to 4000 except leap years using Continue statement
	      
	      for(int x= 1;x<4000;x++) {
	    	  if((x%4==0)||(x%100==0)||(x%400==0)) {
	    		  continue;
	    	  }
	    	  System.out.println(x);
	      }
	}
}
