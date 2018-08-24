package com.capgemini.ebill.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.ebill.entity.Ebill;

public class EbillDaoImpl implements EbillDao {
static int billNum=1000;
static int billAmount=0;
List<Ebill>list;{
	list=new ArrayList<Ebill>();
}
	@Override
	public int generateBillNumber(Ebill ebill) {
		billNum++;
		ebill.setBillNum(billNum);
		list.add(ebill);
		
		return billNum;
	}
	@Override
	public float calculateBillAmount(int billNum, int prevReading, int currReading) {
		// TODO Auto-generated method stub
		int units=currReading-prevReading;
		if(units<100) {
			billAmount=units*10;
		}else {
			billAmount=units*20;
		}
		return billAmount;
	}

}
