package com.example.assignement;

import java.time.LocalDate;
import java.util.Scanner;

public class Balance {
	
	static int balanceAmt = 10;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("Enter credit date details day,month,year"); int day =
		 * sc.nextInt(); int month = sc.nextInt(); int year = sc.nextInt();
		 * 
		 * System.out.println("Enter debit date details day,month,year"); int dday =
		 * sc.nextInt(); int dmonth= sc.nextInt(); int dyear = sc.nextInt();
		
		
		Credit c = new Credit(2,"weekly",LocalDate.of(year, month, day));
		Debit d = new Debit(2,"daily",LocalDate.of(dyear, dmonth, dday));
		 */
		Credit c = new Credit(2,"daily",LocalDate.of(2023,7,1));
		Debit d = new Debit(2,"daily",LocalDate.of(2023,8,1));
		/*
		 * System.out.println(c); System.out.println(d);
		 */
		while(balanceAmt>0) {
			if(c.getFrequency()=="daily") {
				balanceAmt+= creditBalOnToday(c);
				System.out.println(" Credit Bal: "+balanceAmt);
				c.setLt(c.getLt().plusDays(1));
			}
			else if(c.getFrequency()=="weekly") {
				balanceAmt+= creditBalOnWeekly(c);
				System.out.println(" Credit Bal: "+balanceAmt);
				c.setLt(c.getLt().plusWeeks(1));
				System.out.println(c);
			}
			else if(c.getFrequency()=="monthly") {
				balanceAmt = creditBalOnMonthly(c);
				c.setLt(c.getLt().plusMonths(1));
			}
			if(d.getFrequency()=="daily") {
				balanceAmt-= debitBalOnToday(d);
				d.setLt(d.getLt().plusDays(1));
				System.out.println(" Debit Bal: "+balanceAmt);
				System.out.println(d);
			}
			else if(d.getFrequency()=="weekly") {
				balanceAmt-= debitBalOnToday(d);
				d.setLt(d.getLt().plusWeeks(1));
				
			}
			else if(d.getFrequency()=="monthly") {
				balanceAmt-= debitBalOnToday(d);
				d.setLt(d.getLt().plusMonths(1));
			}
			/*
			 * else { System.out.println("Balance Amount is Negative");
			 * System.out.println("Date: "+d.getLt()); }
			 */
		}
		System.out.println("Balance Amount is Negative");
		System.out.println("Date: "+d.getLt());
	}
		
	
	
	static int creditBalOnToday(Credit c){
		int a=0;
		a+= c.getAmount();
		return a;
	}
	static int creditBalOnWeekly(Credit c){
		int a=0;
		a+= c.getAmount();
		return a;
	}
	static int creditBalOnMonthly(Credit c){
		int a=0;
		a+= c.getAmount();
		return a;
	}
	static int debitBalOnToday(Debit d){
		int a=0;
		a=d.getAmount();
		return a;
	}
}
