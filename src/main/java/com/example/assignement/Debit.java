package com.example.assignement;

import java.time.LocalDate;

public class Debit implements Runnable {
	int amount;
	String frequency;
	LocalDate lt;
	int balanceAmt;
	
	@Override
	public String toString() {
		return "Debit [amount=" + amount + ", frequency=" + frequency + ", lt=" + lt + "]";
	}
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
	public Debit() {
		super();
	}
	
	public Debit(int amount, String frequency, LocalDate lt, int balanceAmt) {
		super();
		this.amount = amount;
		this.frequency = frequency;
		this.lt = lt;
		this.balanceAmt = balanceAmt;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Debit d = new Debit(2,"daily",LocalDate.of(2023,8,1),10);
		synchronized (d) {
		if(d.getFrequency()=="daily") {
			
		switch(d.getLt().getDayOfWeek()) {
			case MONDAY:balanceAmt-= debitBalOnToday(d);
				System.out.println(" Debit Bal: "+balanceAmt);
				d.setLt(d.getLt().plusDays(1));
				if(balanceAmt<=0) {
					System.out.println("Balance is negative on: "+d.getLt());
					break;
				}
			case TUESDAY:balanceAmt-= debitBalOnToday(d);
				System.out.println(" Debit Bal: "+balanceAmt);
				d.setLt(d.getLt().plusDays(1));
				if(balanceAmt<=0) {
					System.out.println("Balance is negative on: "+d.getLt());
					break;
				}
			case WEDNESDAY:balanceAmt-= debitBalOnToday(d);
				System.out.println(" Debit Bal: "+balanceAmt);
				d.setLt(d.getLt().plusDays(1));
				if(balanceAmt<=0) {
					System.out.println("Balance is negative on: "+d.getLt());
					break;
				}
			case THURSDAY:balanceAmt-= debitBalOnToday(d);
				System.out.println(" Debit Bal: "+balanceAmt);
				d.setLt(d.getLt().plusDays(1));
				if(balanceAmt<=0) {
					System.out.println("Balance is negative on: "+d.getLt());
					break;
				}
			case FRIDAY:balanceAmt-= debitBalOnToday(d);
				System.out.println(" Debit Bal: "+balanceAmt);
				d.setLt(d.getLt().plusDays(1));
				if(balanceAmt<=0) {
					System.out.println("Balance is negative on: "+d.getLt());
					break;
				}
			case SATURDAY:balanceAmt-= debitBalOnToday(d);
				System.out.println(" Debit Bal: "+balanceAmt);
				d.setLt(d.getLt().plusDays(1));
				if(balanceAmt<=0) {
					System.out.println("Balance is negative on: "+d.getLt());
					break;
				}
			case SUNDAY:balanceAmt-= debitBalOnToday(d);
				System.out.println(" Debit Bal: "+balanceAmt);
				d.setLt(d.getLt().plusDays(1));
				if(balanceAmt<=0) {
					System.out.println("Balance is negative on: "+d.getLt());
					break;
				}
			}
		
		}
		if(d.getFrequency()=="weekly") {
			for(int x=0;x<d.getLt().getDayOfMonth();x++) {
				balanceAmt+= debitBalOnToday(d);
				System.out.println(" Credit Bal: "+balanceAmt);
				System.out.println(d);
				d.setLt(d.getLt().plusWeeks(1));
				if(balanceAmt==0) {
					System.out.println("Balance is negative on: "+d.getLt());
					break;
				}
			}
		}	
		
		if(d.getFrequency()=="monthly") {
			for(int x=0;x<d.getLt().getDayOfYear();x++) {
				balanceAmt+= debitBalOnToday(d);
				System.out.println(" Credit Bal: "+balanceAmt);
				d.setLt(d.getLt().plusMonths(1));
				System.out.println(d);
				if(balanceAmt==0) {
					System.out.println("Balance is negative on: "+d.getLt());
					break;
				}
			}
		}	
		}
	}
	static int debitBalOnToday(Debit d){
		int a=0;
		a+= d.getAmount();
		return a;
	}
	static int DebitBalOnWeekly(Debit d){
		int a=0;
		a+= d.getAmount();
		return a;
	}
	static int DebitBalOnMonthly(Debit d){
		int a=0;
		a+= d.getAmount();
		return a;
	}
	
	
}
