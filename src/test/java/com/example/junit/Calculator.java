package com.example.junit;

import javax.persistence.Entity;

import org.springframework.test.context.ContextConfiguration;

public class Calculator {

	public int doSum(int a,int b,int c) {
		return a+b+c;
	}
	
	public int doMuliti(int a,int b) {
		return a*b;
	}
	
	public Boolean doComparision(int a,int b) {
		return a==b;
	}
	
}
