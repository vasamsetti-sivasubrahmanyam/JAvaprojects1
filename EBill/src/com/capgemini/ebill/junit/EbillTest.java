package com.capgemini.ebill.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.ebill.entity.Ebill;

class EbillTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("before class");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("after class");
	}
public void test() {
	Ebill eb=new Ebill();
	eb.setCustName("siva");
	String name=""+eb.getCustName();
	assertEquals("siva",name);
	System.out.println("Testsuccesful");
}//
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("after class test");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("after test1");
	}

	

}
