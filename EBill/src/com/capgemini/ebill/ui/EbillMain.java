package com.capgemini.ebill.ui;

import java.util.Scanner;

import com.capgemini.ebill.entity.Ebill;
import com.capgemini.ebill.service.EbillService;
import com.capgemini.ebill.service.EbillServiceImpl;

public class EbillMain {
public static void main(String[] args) {
	EbillService service;{
		service=new EbillServiceImpl();
	}
	Scanner sc= new Scanner(System.in);
	System.out.println("****ebill Management*****");
	System.out.println("Enter Your Name");
	String custName=sc.next();
	System.out.println("Enter the previous Reading");
	int prevReading=sc.nextInt();
	System.out.println("Enter the current reading");
	int currReading=sc.nextInt();
	Ebill ebill=new Ebill(custName,prevReading,currReading);
	int billNum=service.generateBillNumber(ebill);
	System.out.println("your bill number is"+billNum);
	float billAmount=service.calculateBillAmount(billNum,prevReading,currReading);
	System.out.println(billAmount);
	
}
}
