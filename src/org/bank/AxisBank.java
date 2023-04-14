package org.bank;

public class AxisBank extends BankInfo {
@Override
public void deposit(int amount) {
	System.out.println("Deposited Amount:" + amount);
}
public static void main(String[] args) {
	AxisBank A = new AxisBank();
	A.deposit(60000);
}
}
