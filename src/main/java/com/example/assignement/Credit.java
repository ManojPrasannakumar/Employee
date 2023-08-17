package com.example.assignement;

import java.time.LocalDate;

public class Credit implements Runnable {
	int amount;
	String frequency;
	LocalDate lt;
	int balanceAmt;
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	public LocalDate getLt() {
		return lt;
	}
	public void setLt(LocalDate lt) {
		this.lt = lt;
	}
	public Credit() {
		super();
	}
	public Credit(int amount, String frequency, LocalDate lt) {
		super();
		this.amount = amount;
		this.frequency = frequency;
		this.lt = lt;
	}
	
	public Credit(int amount, String frequency, LocalDate lt, int balanceAmt) {
		super();
		this.amount = amount;
		this.frequency = frequency;
		this.lt = lt;
		this.balanceAmt = balanceAmt;
	}
	@Override
	public String toString() {
		return "Credit [amount=" + amount + ", frequency=" + frequency + ", lt=" + lt + "]";
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Credit c = new Credit(2,"daily",LocalDate.of(2023,7,1));
		synchronized (c) {
		if(c.getFrequency()=="daily") {
		switch(c.getLt().getDayOfWeek()) {
			case MONDAY:balanceAmt+= creditBalOnToday(c);
				System.out.println(" Credit Bal: "+balanceAmt);
				c.setLt(c.getLt().plusDays(1));
				
			case TUESDAY:balanceAmt+= creditBalOnToday(c);
				System.out.println(" Credit Bal: "+balanceAmt);
				c.setLt(c.getLt().plusDays(1));
				
			case WEDNESDAY:balanceAmt+= creditBalOnToday(c);
				System.out.println(" Credit Bal: "+balanceAmt);
				c.setLt(c.getLt().plusDays(1));
				
			case THURSDAY:balanceAmt+= creditBalOnToday(c);
				System.out.println(" Credit Bal: "+balanceAmt);
				c.setLt(c.getLt().plusDays(1));
			
			case FRIDAY:balanceAmt+= creditBalOnToday(c);
				System.out.println(" Credit Bal: "+balanceAmt);
				c.setLt(c.getLt().plusDays(1));
				
			case SATURDAY:balanceAmt+= creditBalOnToday(c);
				System.out.println(" Credit Bal: "+balanceAmt);
				c.setLt(c.getLt().plusDays(1));
				
			case SUNDAY:balanceAmt+= creditBalOnToday(c);
				System.out.println(" Credit Bal: "+balanceAmt);
				c.setLt(c.getLt().plusDays(1));
			
			}
		if(balanceAmt==0) {
			System.out.println("Balance is negative on: "+c.getLt());
		}
		}
		if(c.getFrequency()=="weekly") {
			for(int x=0;x<c.getLt().getDayOfMonth();x++) {
				balanceAmt+= creditBalOnWeekly(c);
				System.out.println(" Credit Bal: "+balanceAmt);
				System.out.println(c);
				c.setLt(c.getLt().plusWeeks(1));
				if(balanceAmt==0) {
					System.out.println("Balance is negative");
					break;
				}
			}
		}	
		
		if(c.getFrequency()=="monthly") {
			for(int x=0;x<c.getLt().getDayOfYear();x++) {
				balanceAmt+= creditBalOnMonthly(c);
				System.out.println(" Credit Bal: "+balanceAmt);
				c.setLt(c.getLt().plusMonths(1));
				System.out.println(c);
				
			}
		}
		}
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
	
}
