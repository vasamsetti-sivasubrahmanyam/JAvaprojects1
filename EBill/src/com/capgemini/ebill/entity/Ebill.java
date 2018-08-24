package com.capgemini.ebill.entity;

public class Ebill {
	int billNum;
String custName;
int prevReading;
int currReading;
float billAmount;



public Ebill() {
	super();
	this.billNum=00;
	this.custName = "";
	this.prevReading =00;
	this.currReading =00 ;
	this.billAmount =0000.00f;
}
public Ebill(String custName, int prevReading, int currReading) {
	super();
	this.custName = custName;
	this.prevReading = prevReading;
	this.currReading = currReading;
}
public int getBillNum() {
	return billNum;
}
public void setBillNum(int billNum) {
	this.billNum = billNum;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public int getPrevReading() {
	return prevReading;
}
public void setPrevReading(int prevReading) {
	this.prevReading = prevReading;
}
public int getCurrReading() {
	return currReading;
}
public void setCurrReading(int currReading) {
	this.currReading = currReading;
}
public float getBillAmount() {
	return billAmount;
}
public void setBillAmount(float billAmount) {
	this.billAmount = billAmount;
}

@Override
public String toString() {
	return "Ebill [billNum=" + billNum + "\n custName=" + custName + "\n prevReading=" + prevReading + "\n currReading="
			+ currReading + ", billAmount=" + billAmount ;
}

}