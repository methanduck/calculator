package com.methanduck.calculator;

import org.springframework.stereotype.Service;
/**
* calc service
*/
@Service
public class calculator{
	int sum(int a, int b) {
		return a+b;
	}
	int sub(int a, int b) {
		return a-b;
	}
	int multi(int a, int b) {
		return a*b;
	}
	int div(int a, int b) {
		return a/b;
	}
}
