package com.chansofti.demo.calc;

public class CalcFactory {//π§≥ß¿‡
	static Calc calc = null;

	public static Calc createCalc(int num1, int num2, String op) {
		if ("+".equals(op)) {
			calc = new CalcAdd(num1, num2);
		} else if ("-".equals(op)) {
			calc = new CalcBut(num1, num2);
		} else if ("*".equals(op)) {
			calc = new CalcMult(num1, num2);
		} else if ("/".equals(op)) {
			calc = new CalcDivis(num1, num2);
		}else if("%".equals(op)) {
			calc=new SeekingSurplus(num1, num2);
		}
		return calc;
	}
}
