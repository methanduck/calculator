package com.methanduck.calculator;

import org.springframework.stereotype.Service;
@Service
public class calculator{
	int sum(int a, int b) {
		return a+b;
	}
	int sub(int a, int b) {
		return a-b;
	}
}
