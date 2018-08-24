package com.capgemini.ebill.service;

import com.capgemini.ebill.entity.Ebill;

public interface EbillService {

	int generateBillNumber(Ebill ebill);

	float calculateBillAmount(int billNum, int prevReading, int currReading);


}
