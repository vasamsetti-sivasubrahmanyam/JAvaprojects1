package com.capgemini.ebill.service;

import com.capgemini.ebill.dao.EbillDao;
import com.capgemini.ebill.dao.EbillDaoImpl;
import com.capgemini.ebill.entity.Ebill;

public class EbillServiceImpl implements EbillService  {
 private EbillDao serviceDao;
 {
	serviceDao=new EbillDaoImpl();
}
@Override
public int generateBillNumber(Ebill ebill) {
	// TODO Auto-generated method stub
	return serviceDao.generateBillNumber( ebill);
}
@Override
public float calculateBillAmount(int billNum, int prevReading, int currReading) {
	// TODO Auto-generated method stub
	return serviceDao.calculateBillAmount(billNum, prevReading, currReading);
}
}
