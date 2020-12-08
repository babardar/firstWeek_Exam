package firstWeekExam;


public class Ques4 {

	public static void main(String[] args) {
	// Calculate tips for the check(eg . Java TipCalculator < check amoiunt > <%tips>)

		float checkAmount = Float.parseFloat(args[0]);
		float tipPercentage = Float.parseFloat(args[1]);
		float tipAmount= (float) ((checkAmount*tipPercentage/100));
		float totalAmount = tipAmount + checkAmount;
		System.out.println("Tip Amount: "+ tipAmount);
		System.out.println("Total Amount including Tip: " + totalAmount);	
	}
}
