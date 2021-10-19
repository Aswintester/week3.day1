package week3.day1;

public class AxisBankAssignment3 extends BankInfoAssignment3 {

	public void deposit() {
		
		System.out.print("My Axis Bank other Deposits");
	}
	
	public static void main(String[] args) {
		
		AxisBankAssignment3 axisBank = new AxisBankAssignment3();
		
		axisBank.fixed();
		axisBank.saving();
		axisBank.deposit(); //overiding
		
	}
}
