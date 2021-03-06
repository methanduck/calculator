package com.methanduck.calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
* calc controller
*/
@RestController
class calculatorController {
	@Autowired
	private calculator Calculator;
	@RequestMapping("/sum")
		String sum(@RequestParam("a") Integer a,
			   @RequestParam("b") Integer b) {
		return String.valueOf(Calculator.sum(a, b));
	}

	@RequestMapping("/sub")
		String sub(@RequestParam("a") Integer a,
			   @RequestParam("b") Integer b) {
		return String.valueOf(Calculator.sub(a,b));
	}
	
	@RequestMapping("/div")
		String div(@RequestParam("a") Integer a,
			   @RequestParam("b") Integer b) {
		return String.valueOf(Calculator.sub(a,b));
	}

	@RequestMapping("/multi")
		String multi(@RequestParam("a") Integer a,
			   @RequestParam("b") Integer b) {
		return String.valueOf(Calculator.sub(a,b));
	}
}
