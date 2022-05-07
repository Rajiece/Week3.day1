package week3.day1;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("deposit:50L");
	}

	public static void main(String[] args) {
		AxisBank obj= new AxisBank();
		obj.deposit();
        obj.saving();
        obj.fixed();
	}

}
