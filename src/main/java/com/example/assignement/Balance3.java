package com.example.assignement;

import java.time.LocalDate;
import java.util.Scanner;

public class Balance3 {
	
	static int balanceAmt = 10;
	
	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		
		 * System.out.println("Enter credit date details day,month,year"); int day =
		 * sc.nextInt(); int month = sc.nextInt(); int year = sc.nextInt();
		 * 
		 * System.out.println("Enter debit date details day,month,year"); int dday =
		 * sc.nextInt(); int dmonth= sc.nextInt(); int dyear = sc.nextInt();
		
		
		Credit c = new Credit(2,"weekly",LocalDate.of(year, month, day));
		Debit d = new Debit(2,"daily",LocalDate.of(dyear, dmonth, dday));
		 */
		Credit c = new Credit(2,"daily",LocalDate.of(2023,8,1),balanceAmt);
		Credit c2 = new Credit(2,"monthly",LocalDate.of(2023,1,1),balanceAmt);
		Debit d = new Debit(2,"daily",LocalDate.of(2023,8,1),balanceAmt);
		Debit d2 = new Debit(2,"weekly",LocalDate.of(2023,5,20),balanceAmt);
		/*
		 * System.out.println(c); System.out.println(d);
		 */
		
		Thread t = new Thread(c);
		t.start();
		
		Thread t2 = new Thread(d);
		t2.start();
		
		Thread t3 = new Thread(d2);
		t3.start();
		
		Thread t4 = new Thread(c2);
		t4.start();
		
	
	}
}