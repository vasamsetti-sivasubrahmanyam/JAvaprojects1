package com.capgemini.ebill.dao;

import com.capgemini.ebill.entity.Ebill;

public interface EbillDao {

	int generateBillNumber(Ebill ebill);

	float calculateBillAmount(int billNum, int prevReading, int currReading);

}
