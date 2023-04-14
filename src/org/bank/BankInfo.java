package org.bank;

public class BankInfo {
	public void saving(int amount) {
System.out.println("Saving Amount:" + amount);
	}
public void fixed(int amount) {
System.out.println("Fixed Amount:" + amount );
}
public void deposit(int amount) {
System.out.println("Deposited Amount" + amount);
}
public static void main(String[] args) {
	BankInfo B = new BankInfo();
	B.saving(20000);
	B.fixed(3000);
	B.deposit(2000);
}
}
